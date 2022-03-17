package ice.comento.board.domain;

import ice.comento.model.BaseEntity;
import ice.comento.user.domain.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 게시글 엔티티
 * @author baki90
 *
 * @author jeong-yeonhee
 * @// FIXME: 2022/03/14 게시글 공개 활성화 여부 컬럼 추가
 */
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends BaseEntity {

    private Category category; // 게시판

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private User writer; // 글쓴이

    private String title; // 게시글 제목

    @Lob
    private String contents; // 내용

    @Embedded
    private Photos photos; // 사진

    @Embedded
    private HashTags hashTags; // 관심 키워드

    private Boolean active; //게시판 공개 여부

    /**@author jeong-yeonhee
     * 정적 팩토리 메서드로 구현
     * 포스트 생성 메서드
     * @param category
     * @param writer
     * @param title
     * @param contents
     * @param photos
     * @param hashTags
     * @return 생성된 게시글 반환
     */
    public static Board createPost(Category category, User writer, String title, String contents, Photos photos, HashTags hashTags) {
        Board board=new Board();
        board.category = category;
        board.writer = writer;
        board.title = title;
        board.contents = contents;
        board.photos = photos;
        board.hashTags = hashTags;
        board.active=true;
        return board;
    }


    /**@author jeong-yeonhee
     * 포스트 수정 메서드
     * 조건:게시자는 바꿀 수 없다.
     * @param category
     * @param title
     * @param contents
     * @param photos
     * @param hashTags
     */
    public void fixPost (Category category, String title, String contents, Photos photos, HashTags hashTags){
        this.category=category;
        this.title=title;
        this.contents=contents;
        this.hashTags=hashTags;
        this.photos=photos;
    }

    /**@author jeong-yeonhee
     * 포스트 삭제 메서드
     * 활성 상태를 false로 바꾼다.
     */
    public void deletePost(){
        this.active=false;
    }

}
