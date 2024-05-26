package africa.semicolon.data.repo;

import africa.semicolon.data.model.EstoreUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<EstoreUser, String> {

}
