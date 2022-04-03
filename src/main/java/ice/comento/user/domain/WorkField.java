package ice.comento.user.domain;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/**
 * @author jeong-yeonhee
 */
@Entity
@Table(name = "work_field")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkField extends BaseEntity {
    private String workField;

    @OneToMany(mappedBy = "workField",fetch = FetchType.LAZY)
    private List<Worker> workerList=new ArrayList<>();
}
