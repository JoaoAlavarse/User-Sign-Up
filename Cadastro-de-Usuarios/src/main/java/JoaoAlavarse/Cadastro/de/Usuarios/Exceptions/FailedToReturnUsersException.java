package JoaoAlavarse.Cadastro.de.Usuarios.Exceptions;

public class FailedToReturnUsersException extends RuntimeException{
    public FailedToReturnUsersException() {
        super("Failed to return users");
    }
    public FailedToReturnUsersException(String message) {
        super(message);
    }
}
