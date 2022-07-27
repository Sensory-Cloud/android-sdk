package ai.sensorycloud.interactors;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ai.sensorycloud.api.v1.audio.TranscribeWord;
import ai.sensorycloud.api.v1.audio.TranscribeWordResponse;

/**
 * A structure that aggregates and stores transcription responses
 * This call can maintain a full transcript returned from the server's windowed response
 */
public class TranscriptAggregator {

    private static final TranscribeWord FILLER = TranscribeWord.getDefaultInstance();
    private List<TranscribeWord> wordList = new LinkedList<>();

    /**
     * Processes a single sliding-window response from the server
     * @param response The current word list response from the server
     * @throws java.lang.ArrayIndexOutOfBoundsException Thrown if the response contains invalid indices
     */
    public void processResponse(TranscribeWordResponse response) throws java.lang.ArrayIndexOutOfBoundsException {
        if (response.getWordsCount() == 0) {
            return;
        }

        // Expand the internal word list if needed
        int responseSize = (int) (response.getLastWordIndex() + 1);
        if (responseSize > wordList.size()) {
            wordList.addAll(Collections.nCopies(responseSize - wordList.size(), FILLER));
        }

        // Copy over the words in the response to the internal word list
        for (TranscribeWord word : response.getWordsList()) {
            if (word.getWordIndex() >= wordList.size()) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Server response contained a word with an out of bounds index");
            }
            wordList.set((int) word.getWordIndex(), word);
        }

        // Shrink the internal word list if needed
        if (responseSize < wordList.size()) {
            wordList.subList(responseSize, wordList.size()).clear();
        }
    }

    /**
     * Returns the current raw transcript and associated metadata
     * @return The current raw transcript
     */
    public List<TranscribeWord> getWordList() {
        return wordList;
    }

    /**
     * The full transcript as computed from the current word list
     * @return The full transcript as a string
     */
    public String getTranscript() {
        return getTranscript(" ");
    }

    /**
     * The full transcript as computed from the current word list
     * @param delimiter Delimiter character(s) to put between transcribed words. Pass in an empty string to use no delimiter
     * @return The full transcript as a string
     */
    public String getTranscript(String delimiter) {
        List<String> words = wordList.stream().map(word -> word.getWord().trim()).collect(Collectors.toList());
        return String.join(delimiter, words);
    }
}
