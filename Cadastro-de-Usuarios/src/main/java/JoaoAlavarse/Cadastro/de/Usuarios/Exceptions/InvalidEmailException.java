package JoaoAlavarse.Cadastro.de.Usuarios.Exceptions;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String message) {
        super(message);
    }

    public InvalidEmailException() {
        super("Email Invalido");
    }
}
