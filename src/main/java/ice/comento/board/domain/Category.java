package ice.comento.board.domain;

import ice.comento.model.Role;
import ice.comento.user.Status;

import javax.persistence.Entity;

/**
 * @author jeong-yeonhee
 *
 */
public enum Category {

    JOB_WORRIES("취업 고민", Role.Worker,Role.IceStudent),
    ICE_WORRIES("대학생 고민", Role.IceStudent,Role.IceStudent),
    FREE("자유게시판",Role.All,Role.All);


    private String name; // 게시판 이름
    private Role questionAuth; // 질문 권한
    private Role commentAuth; // 댓글 권한

    Category(String name, Role questionAuth, Role commentAuth) {
        this.name = name;
        this.questionAuth = questionAuth;
        this.commentAuth = commentAuth;
    }

    public String getName() {
        return name;
    }

    public Role getQuestionAuth() {
        return questionAuth;
    }

    public Role getCommentAuth() {
        return commentAuth;
    }
}
