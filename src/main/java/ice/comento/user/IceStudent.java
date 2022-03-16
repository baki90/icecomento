
package ice.comento.user;

import ice.comento.model.Rank;
import ice.comento.model.User;
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
public class IceStudent extends User {
    private Status status;
    @OneToMany(mappedBy = "iceStudent",fetch = FetchType.LAZY)
    private Set<Interests> interests =new HashSet<>();

    @Builder
    public IceStudent(String logId, String pw, int studentId, String nickName, String introduction, Rank rank, Status status, Set<Interests> interests) {
        super(logId, pw, studentId, nickName, introduction, rank);
        this.status = status;
        this.interests = interests;
    }

    public void updateIceStudent(String pw, String nickName, String introduction, Rank rank, Status status, Set<Interests> interests) {
        this.updateUser(pw, nickName, introduction, rank);
        this.status = status;
        this.interests = interests;
    }
}
