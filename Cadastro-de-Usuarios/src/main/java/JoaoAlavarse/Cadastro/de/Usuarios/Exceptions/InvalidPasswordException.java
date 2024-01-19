package JoaoAlavarse.Cadastro.de.Usuarios.Exceptions;

public class InvalidPasswordException extends RuntimeException{

    public InvalidPasswordException(String message) {
        super(message);
    }

    public InvalidPasswordException() {
        super("Senha Invalida. A senha precisa conter caracteres especiais e ter no minimo 6 caracteres");
    }
}
