package JoaoAlavarse.Cadastro.de.Usuarios.Service;

import JoaoAlavarse.Cadastro.de.Usuarios.Constants.Constants;
import JoaoAlavarse.Cadastro.de.Usuarios.DTOs.UserRequestDTO;
import JoaoAlavarse.Cadastro.de.Usuarios.Entity.UserEntity;
import JoaoAlavarse.Cadastro.de.Usuarios.Exceptions.FailedToCreateUserException;
import JoaoAlavarse.Cadastro.de.Usuarios.Exceptions.FailedToReturnUsersException;
import JoaoAlavarse.Cadastro.de.Usuarios.Exceptions.InvalidEmailException;
import JoaoAlavarse.Cadastro.de.Usuarios.Exceptions.InvalidPasswordException;
import JoaoAlavarse.Cadastro.de.Usuarios.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    private boolean verifyPassword(String password) throws InvalidPasswordException{
        if ( password.length() >= 6 && containSpecialCharacters(password)){
            return true;
        }
        throw new InvalidPasswordException();
    }

    private boolean containSpecialCharacters(String password) {
        for (char character: Constants.SPECIAL_CHARACTERS.toCharArray()) {
            if (password.contains(String.valueOf(character))){
                return true;
            }
        }
            return false;
    }

    private boolean verifyEmail(String email) throws InvalidEmailException{
        Pattern pattern = Pattern.compile(Constants.EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
        throw new InvalidEmailException();
    }

    private boolean verifyUserData(String email, String password){
        return verifyEmail(email) && verifyPassword(password);
    }

    public void saveUser(UserRequestDTO dto) {
        if (verifyUserData(dto.email(), dto.password())) {
            try {
            repository.save(new UserEntity(dto));
            } catch (Exception e){
                throw new FailedToCreateUserException();
            }
        }
    }

    public List<UserEntity> getAll(){
        try {
            return repository.findAll();
        } catch (Exception e){
            throw new FailedToReturnUsersException();
        }
    }

}
