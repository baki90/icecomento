package ice.comento.user.domain;
/**
 * @author jeong-yeonhee
 * @// FIXME: 2022/03/15
 * 문턱치 스코어 추가하여 회원의 Score에 따른 등급 구분 로직을 담음
 */
public enum Rank {

    BRONZE("브론즈",100),
    SILVER("실버",500),
    GOLD("골드",1000),
    PLATINUM("플레티넘",1500),
    DIAMOND("다이아",2000),
    POWER_ICE("핵정통",Integer.MAX_VALUE);

    private String title;
    private int threshold;

    Rank(String title, int threshold) {
        this.title = title;
        this.threshold = threshold;
    }

    public String getTitle() {
        return title;
    }

    public int getThreshold() {
        return threshold;
    }

    /**
     *
     * @param score
     * @return score에 해당하는 Rank 리턴
     */
    public static Rank findRank(int score){

        Rank result=Rank.POWER_ICE;

        if(score<=Rank.BRONZE.getThreshold()){
            result=Rank.BRONZE;
        }else if(score<=Rank.SILVER.getThreshold()){
            result=Rank.SILVER;
        }else if(score<=Rank.GOLD.getThreshold()){
            result=Rank.GOLD;
        }else if(score<=Rank.PLATINUM.getThreshold()){
            result=Rank.PLATINUM;
        }else if(score<=Rank.DIAMOND.getThreshold()){
            result=Rank.DIAMOND;
        }

        return result;
    }
}
