package ice.comento.board.repository;

import ice.comento.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,String> {

}
