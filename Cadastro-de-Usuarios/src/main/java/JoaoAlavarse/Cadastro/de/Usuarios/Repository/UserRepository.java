package JoaoAlavarse.Cadastro.de.Usuarios.Repository;

import JoaoAlavarse.Cadastro.de.Usuarios.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
