package JoaoAlavarse.Cadastro.de.Usuarios.Entity;

import JoaoAlavarse.Cadastro.de.Usuarios.DTOs.UserRequestDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
