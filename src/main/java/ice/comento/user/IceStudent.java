
package ice.comento.user;

import ice.comento.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
/**
 * @author jeong-yeonhee
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IceStudent extends User {
    private Status status;
    @OneToMany(mappedBy = "iceStudent",fetch = FetchType.LAZY)
    private Set<Interests> interests=new HashSet<>();
}
