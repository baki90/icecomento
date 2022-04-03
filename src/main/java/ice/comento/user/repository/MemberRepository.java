package ice.comento.user.repository;

import ice.comento.user.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository<T extends Member> extends JpaRepository<T, Long> {

    Member findByLogId(String writer_id);
}
