package JoaoAlavarse.Blood.Center.Entity;

import JoaoAlavarse.Blood.Center.DTOs.UserRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "userId")
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserEntity(UserRequestDTO dto) {
        this.firstName = dto.firstName();
        this.lastName = dto.lastName();
        this.email = dto.email();
        this.password = dto.password();
    }
}
