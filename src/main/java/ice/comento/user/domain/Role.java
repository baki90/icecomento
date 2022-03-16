package ice.comento.user.domain;

/**
 * @author jeong-yeonhee
 */
public enum Role {
    IceStudent("정통인"),
    Worker("직장인"),
    All("모두");

    Role(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private String title;
}
