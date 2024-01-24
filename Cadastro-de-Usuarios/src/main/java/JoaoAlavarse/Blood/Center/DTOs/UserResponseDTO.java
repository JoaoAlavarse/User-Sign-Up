package JoaoAlavarse.Blood.Center.DTOs;

import JoaoAlavarse.Blood.Center.Entity.UserEntity;

public record UserResponseDTO(String userId, String firstName, String lastName, String email, String password) {
    public UserResponseDTO (UserEntity user){
        this(user.getUserId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
    }
}
