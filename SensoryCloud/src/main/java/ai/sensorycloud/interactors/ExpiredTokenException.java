package ai.sensorycloud.interactors;

/**
 * ExpiredTokenException is thrown from `EnrollmentTokenInteractor` the first time an expired token is loaded
 * Subsequent attempts to load the token will return an empty optional.
 */
public class ExpiredTokenException extends Exception {
    public ExpiredTokenException() {
    }

    public ExpiredTokenException(String message) {
        super(message);
    }
}
