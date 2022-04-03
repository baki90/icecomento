
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
public class Interest extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "ice_student_id")
    private IceStudent iceStudent;

    @ManyToOne
    @JoinColumn(name = "work_field_id")
    private WorkField workField;

    public static Interest of(IceStudent iceStudent, WorkField workField) {
        Interest interest = new Interest();
        interest.setWorkField(workField);
        interest.setIceStudent(iceStudent);
        return interest;
    }

    protected void setWorkField(WorkField workField) {
        this.workField = workField;
    }

    protected void setIceStudent(IceStudent iceStudent) {
        this.iceStudent = iceStudent;
    }
}
