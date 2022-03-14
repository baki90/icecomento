package ice.comento.model;
/**
 * @author jeong-yeonhee
 */
public enum Rank {

    BRONZE("브론즈"),
    SILVER("실버"),
    GOLD("골드"),
    PLATINUM("플레티넘"),
    DIAMOND("다이아"),
    POWER_ICE("핵정통");

    private String title;

    Rank(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
