package ice.comento.board.domain;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * 커뮤니티(게시판)
 * @// FIXME: 2022/03/14 @author jeong-yeonhee
 * @deprecated 카테고리 Enum으로 관리
 *
 * @author baki90
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardCategory extends BaseEntity {
    private String name; // 게시판 이름
    private String questionAuth; // 질문 권한
    private String commentAuth; // 댓글 권한
}
