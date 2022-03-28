package ice.comento.user.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 현직자 정보 entity
 * @author baki90
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Worker extends Member {

    private String company;

    @ManyToOne
    @JoinColumn(name = "work_field_id")
    private WorkField workField;
    private double adoptionRate; // 답변 채택률

    @Builder
    public Worker(String logId, String pw, int studentId, String nickName, String introduction, Rank rank, String company, WorkField workField, double adoptionRate) {
        super(logId, pw, studentId, nickName, introduction, rank);
        this.company = company;
        this.workField = workField;
        this.adoptionRate = 0;
    }

    /**
     * 현직자 정보를 수정한다.
     * @param pw
     * @param nickName
     * @param introduction
     * @param rank
     * @param workField
     */
    public void updateWorker(String pw, String nickName, String introduction, Rank rank, WorkField workField) {
        this.updateUser(pw, nickName, introduction, rank);
        this.workField = workField;
    }

    /**
     * 답변 채택률을 세팅한다.
     * @param adoptionRate
     */
    public void setAdoptionRate(double adoptionRate) {
        if(adoptionRate >= 0) {
            this.adoptionRate = adoptionRate;
        }
    }

    /**
     * 답변 채택률을 계산한다.
     * @param adoptionCount 채택 개수
     * @param commentCount 답변 개수
     * @return 답변 채택률
     */
    public double calcAdoptionRate(int adoptionCount, int commentCount) {
        return adoptionCount / (double) commentCount;
    }
}
