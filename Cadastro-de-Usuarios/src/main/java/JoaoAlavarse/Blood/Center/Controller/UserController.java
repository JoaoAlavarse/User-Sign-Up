package JoaoAlavarse.Blood.Center.Controller;

import JoaoAlavarse.Blood.Center.DTOs.UserRequestDTO;
import JoaoAlavarse.Blood.Center.Entity.UserEntity;
import JoaoAlavarse.Blood.Center.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping
    public ResponseEntity<String> saveUser(@Valid @RequestBody UserRequestDTO dto){
        service.saveUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success");
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }
}
