package ice.comento.user.repository;

import ice.comento.user.domain.Interest;
import ice.comento.user.domain.WorkField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface WorkFieldRepository extends JpaRepository<WorkField, Long> {
    List<WorkField> findByIdIn(Set<Long> ids);
}
