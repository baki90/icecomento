package ice.comento.board.domain;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 글에 대한 댓글
 *
 * @author baki90
 */
@Document
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseEntity {
    @Id
    private String id;
    private String userId; // 글쓴이 아이디
    private String boardId; // 답변 단 게시글 ID
    private String commentId; // 답변 단 댓글 ID
    private String content; // 댓글 내용
}
