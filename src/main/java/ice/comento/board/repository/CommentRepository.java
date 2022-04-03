package ice.comento.board.repository;


import ice.comento.board.domain.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface CommentRepository extends MongoRepository<Comment, String> {
    Comment findByUserId(String userId);
}
