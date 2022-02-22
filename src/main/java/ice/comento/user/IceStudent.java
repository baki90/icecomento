
package ice.comento.user;

import ice.comento.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "ice_student")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IceStudent extends User {
    private Status status;
    @OneToMany(mappedBy = "iceStudent",fetch = FetchType.LAZY)
    private Set<Interests> interests=new HashSet<>();
}
