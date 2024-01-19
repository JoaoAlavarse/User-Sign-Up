package JoaoAlavarse.Cadastro.de.Usuarios.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRequestDTO(@NotBlank @NotNull String firstName, @NotBlank String lastName, @NotBlank String email, @NotBlank String password) {

}
