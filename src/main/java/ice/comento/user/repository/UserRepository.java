package ice.comento.user.repository;

import ice.comento.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<T extends User> extends JpaRepository<T, String> {

}
