
package ice.comento.user.domain;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

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
    @JoinColumn(name = "work_field_id")
    private WorkField workField;

}
