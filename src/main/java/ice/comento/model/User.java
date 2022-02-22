package ice.comento.model;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
abstract public class User extends BaseEntity {
    protected String logId;
    protected String pw;
    protected int studentId;
    protected String nickName;
    protected String introduction;
    protected Rank rank;
}
