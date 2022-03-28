package ice.comento.board.repository;


import ice.comento.board.domain.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
    Comment findByUserId(String userId);
}
