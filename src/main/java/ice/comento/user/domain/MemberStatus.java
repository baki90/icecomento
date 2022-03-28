package ice.comento.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 유저 활성 상태 Enum Class
 * @author baki90
 */
@Getter
@AllArgsConstructor
public enum MemberStatus {
    ACTIVE("활성"),
    SLEEP("휴면계정"),
    WITHDRAW("탈퇴");

    private String title;
}
