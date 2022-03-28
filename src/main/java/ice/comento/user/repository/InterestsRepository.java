package ice.comento.user.repository;

import ice.comento.user.domain.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface InterestsRepository extends JpaRepository<Interest, Long> {
}
