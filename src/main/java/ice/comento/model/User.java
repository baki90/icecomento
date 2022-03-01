package ice.comento.model;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
abstract public class User extends BaseEntity {
    protected String logId;
    protected String pw;
    protected int studentId;
    protected String nickName;
    protected String introduction;
    protected Rank rank;
}
