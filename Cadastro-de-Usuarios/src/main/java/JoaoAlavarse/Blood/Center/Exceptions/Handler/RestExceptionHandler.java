package JoaoAlavarse.Blood.Center.Exceptions.Handler;

import JoaoAlavarse.Blood.Center.Exceptions.FailedToCreateUserException;
import JoaoAlavarse.Blood.Center.Exceptions.InvalidEmailException;
import JoaoAlavarse.Blood.Center.Exceptions.InvalidPasswordException;
import JoaoAlavarse.Blood.Center.Exceptions.FailedToReturnUsersException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(InvalidPasswordException.class)
    private ResponseEntity<String> invalidPasswordHandler(InvalidPasswordException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid password.");
    }

    @ExceptionHandler(InvalidEmailException.class)
    private ResponseEntity<String> invalidEmailHandler(InvalidEmailException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid email.");
    }

    @ExceptionHandler(FailedToCreateUserException.class)
    private ResponseEntity<String> failedToCreateUserHandler(FailedToCreateUserException exception){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating user");
    }

    @ExceptionHandler(FailedToReturnUsersException.class)
    private ResponseEntity<String> failedToReturnUsersHandler(FailedToReturnUsersException exception){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error returning users");
    }
}
