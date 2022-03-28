package ice.comento.user.domain;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/**
 * @author jeong-yeonhee
 */

@Entity
@Table(name = "member")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
abstract public class Member extends BaseEntity {
    protected String logId;
    protected String pw;
    protected int studentId;
    protected String nickName;
    protected String introduction;
    protected Rank rank;
    protected MemberStatus memberStatus;

    /**
     * Member Entity 생성
     * @param logId
     * @param pw
     * @param studentId
     * @param nickName
     * @param introduction
     */
    protected Member(String logId, String pw, int studentId, String nickName, String introduction) {
        this.logId = logId;
        this.setPw(pw);
        this.setNickName(nickName);
        this.studentId = studentId;
        this.introduction = introduction;
        // 신규 가입 유저 BRONZE 등급
        this.rank = Rank.BRONZE;
        // USER 활성화
        this.memberStatus = MemberStatus.ACTIVE;
    }

    private void setPw(String pw) {
        this.pw = pw;
    }

    private void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * User 정보를 수정한다.
     * @author baki90
     * @param pw
     * @param nickName
     * @param introduction
     * @param rank
     */
    protected void updateUser(String pw, String nickName, String introduction, Rank rank){
        if(pw != null) this.setPw(pw);
        if(nickName != null) setNickName(nickName);
        if(introduction != null) this.introduction = introduction;
        if(rank != null) this.rank = rank;
    }

    /**
     * 회원 탈퇴
     */
    public void deleteUser() {
        this.memberStatus = MemberStatus.WITHDRAW;
    }

}
