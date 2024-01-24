package JoaoAlavarse.Blood.Center.Exceptions;

public class FailedToCreateUserException extends RuntimeException{

    public FailedToCreateUserException() {
        super("Failed to create user.");
    }
    public FailedToCreateUserException(String message) {
        super(message);
    }
}
