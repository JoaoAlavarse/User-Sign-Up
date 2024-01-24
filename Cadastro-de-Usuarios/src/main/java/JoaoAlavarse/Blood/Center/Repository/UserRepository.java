package JoaoAlavarse.Blood.Center.Repository;

import JoaoAlavarse.Blood.Center.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
