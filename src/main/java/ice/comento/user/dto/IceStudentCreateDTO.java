package ice.comento.user.dto;

import ice.comento.user.domain.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * 정통인 회원가입 DTO
 */
@Getter
@NoArgsConstructor
public class IceStudentCreateDTO {
    private String logId; // 아이디
    private String pw; // 비밀번호
    private int studentId; // 학번
    private String nickName; // 닉네임
    private String introduction; // 자기소개
    private Status studentStatus; // 재학 상태
    private Set<Long> workFieldIds; // 관심사 ID list

    @Builder
    public IceStudentCreateDTO(String logId, String pw, int studentId, String nickName, String introduction, Status studentStatus, Set<Long> workFieldIds) {
        this.logId = logId;
        this.pw = pw;
        this.studentId = studentId;
        this.nickName = nickName;
        this.introduction = introduction;
        this.studentStatus = studentStatus;
        this.workFieldIds = workFieldIds;
    }
}
