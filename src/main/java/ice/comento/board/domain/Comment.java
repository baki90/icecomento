package ice.comento.board.domain;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 글에 대한 댓글
 *
 * @author baki90
 * @author jeong-yeonhee
 * @// FIXME: 2022/03/15 DB연동 관련 수정
 */
@Getter
@Document("test")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseEntity {

    private String userId; // 글쓴이 아이디
    private String boardId; // 답변 단 게시글 ID
    private String commentId; // 답변 단 댓글 ID
    private String content; // 댓글 내용

    public Comment(String userId, String boardId, String commentId, String content) {
        this.userId = userId;
        this.boardId = boardId;
        this.commentId = commentId;
        this.content = content;
    }
}
