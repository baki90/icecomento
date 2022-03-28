package ice.comento.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


/**
 * Base Entity
 * @author bakibaki
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO: 아래 컬럼 추가할 것
    // create time
    // creator
    // update time
    // updater

    public Long getId() {
        return id;
    }
}
