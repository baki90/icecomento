
package ice.comento.user.domain;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.junit.Ignore;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author jeong-yeonhee
 */
@Entity
@Table(name = "interests")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Interests extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "ice_student_id")
    private IceStudent iceStudent;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

}
