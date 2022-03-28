
package ice.comento.user.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
/**
 * 재학생 정보 entity
 * @author baki90
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IceStudent extends Member {
    private Status studentStatus;
    @OneToMany(mappedBy = "iceStudent",fetch = FetchType.LAZY)
    private Set<Interests> interests =new HashSet<>();

    @Builder
    public IceStudent(String logId, String pw, int studentId, String nickName, String introduction, Rank rank, Status studentStatus, Set<Interests> interests) {
        super(logId, pw, studentId, nickName, introduction, rank);
        this.studentStatus = studentStatus;
        this.interests = interests;
    }

    public void updateIceStudent(String pw, String nickName, String introduction, Rank rank, Status studentStatus, Set<Interests> interests) {
        this.updateUser(pw, nickName, introduction, rank);
        this.studentStatus = studentStatus;
        this.interests = interests;
    }
}
