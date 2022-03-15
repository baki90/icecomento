package ice.comento.board.repository;

import ice.comento.board.domain.Comment;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest()
class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    void findByUserId() {
        Comment comment=commentRepository.findByUserId("jyh");
        System.out.println(comment.getId());
        Assertions.assertThat(comment.getContent()).isEqualTo("테스트");

    }

}