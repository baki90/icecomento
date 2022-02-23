package ice.comento.board.domain;

import ice.comento.model.BaseEntity;
import ice.comento.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 게시글 엔티티
 *
 * @author baki90
 */

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "category_id")
    private BoardCategory category; // 게시판

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private User writer; // 글쓴이

    private String title; // 게시글

    @Lob
    private String contents; // 내용

    @Embedded
    private Photos photos; // 사진

    @Embedded
    private HashTags hashTags; // 관심 키워드
}
