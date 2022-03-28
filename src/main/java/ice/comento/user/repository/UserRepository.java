package ice.comento.user.repository;

import ice.comento.user.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<T extends Member> extends JpaRepository<T, String> {

    Member findByLogId(String writer_id);
}
