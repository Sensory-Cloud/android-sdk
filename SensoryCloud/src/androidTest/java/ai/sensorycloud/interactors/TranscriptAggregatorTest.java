package ai.sensorycloud.interactors;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import ai.sensorycloud.api.v1.audio.TranscribeWord;
import ai.sensorycloud.api.v1.audio.TranscribeWordResponse;

public class TranscriptAggregatorTest extends TestCase {

    public void testEmptyResponse() throws Exception {
        TranscriptAggregator aggregator = new TranscriptAggregator();

        aggregator.processResponse(TranscribeWordResponse.getDefaultInstance());
        assertTrue("Empty response should result in an empty transcript", aggregator.getWordList().isEmpty());
        assertEquals(aggregator.getTranscript(), "");
    }

    public void testSingleResponse() throws Exception {
        TranscriptAggregator aggregator = new TranscriptAggregator();

        TranscribeWord foo = TranscribeWord.newBuilder()
                .setWord("foo")
                .setWordIndex(0)
                .build();
        TranscribeWord bar = TranscribeWord.newBuilder()
                .setWord("bar")
                .setWordIndex(1)
                .build();
        TranscribeWordResponse response = makeWordResponse(Arrays.asList(foo, bar));

        aggregator.processResponse(response);
        assertEquals(aggregator.getWordList().size(), 2);
        assertEquals(aggregator.getTranscript(), "foo bar");
        assertEquals(aggregator.getTranscript(""), "foobar");
        assertEquals(aggregator.getTranscript("..."), "foo...bar");
    }

    public void testMultipleResponses() throws Exception {
        TranscriptAggregator aggregator = new TranscriptAggregator();

        TranscribeWord foo = TranscribeWord.newBuilder()
                .setWord("foo")
                .setWordIndex(0)
                .build();
        TranscribeWord bar = TranscribeWord.newBuilder()
                .setWord("bar")
                .setWordIndex(1)
                .build();
        TranscribeWordResponse response = makeWordResponse(Arrays.asList(foo, bar));
        aggregator.processResponse(response);

        // A response that adds a new word
        TranscribeWord baz = TranscribeWord.newBuilder()
                .setWord("baz")
                .setWordIndex(2)
                .build();
        response = makeWordResponse(Arrays.asList(bar, baz));

        aggregator.processResponse(response);
        assertEquals(aggregator.getWordList().size(), 3);
        assertEquals(aggregator.getTranscript(), "foo bar baz");

        // A response that replaces a word
        TranscribeWord food = TranscribeWord.newBuilder()
                .setWord("food")
                .setWordIndex(0)
                .build();
        response = makeWordResponse(Arrays.asList(food), 2L);

        aggregator.processResponse(response);
        assertEquals(aggregator.getWordList().size(), 3);
        assertEquals(aggregator.getTranscript(), "food bar baz");

        // A response that removes a word
        response = makeWordResponse(Arrays.asList(food, bar));

        aggregator.processResponse(response);
        assertEquals(aggregator.getWordList().size(), 2);
        assertEquals(aggregator.getTranscript(), "food bar");
    }

    public void testInvalidResponse() throws Exception {
        TranscriptAggregator aggregator = new TranscriptAggregator();

        TranscribeWord foo = TranscribeWord.newBuilder()
                .setWord("foo")
                .setWordIndex(0)
                .build();
        TranscribeWord bar = TranscribeWord.newBuilder()
                .setWord("bar")
                .setWordIndex(1)
                .build();
        // bar's word index is > the response's maxWordIndex
        TranscribeWordResponse response = makeWordResponse(Arrays.asList(foo, bar), 0L);

        try {
            aggregator.processResponse(response);
            fail("Exception should be thrown on bad index");
        } catch (Exception ignored) { }
    }

    public TranscribeWordResponse makeWordResponse(List<TranscribeWord> words) {
        Long maxIndex = words.stream().mapToLong(TranscribeWord::getWordIndex).max().orElse(0);
        return makeWordResponse(words, maxIndex);
    }

    public TranscribeWordResponse makeWordResponse(List<TranscribeWord> words, Long lastWordIndex) {
        TranscribeWordResponse.Builder response = TranscribeWordResponse.newBuilder();
        response.addAllWords(words);
        response.setLastWordIndex(lastWordIndex);
        response.setFirstWordIndex(words.stream().mapToLong(TranscribeWord::getWordIndex).min().orElse(0));
        return response.build();
    }
}
