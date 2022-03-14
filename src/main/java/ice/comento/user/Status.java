package ice.comento.user;

/**
 * @// FIXME: 2022/03/14 영어와 한글 매핑 가능하도록 수정
 * @author jeong-yeonhee
 */
public enum Status {
    STUDENT("재학"),
    LEAVE("휴학"),
    GRADUATE("졸업");

    private String title;

    Status(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
