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
public class Worker extends User {

    private String company;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    private double adoptionRate; // 답변 채택률

    @Builder
    public Worker(String logId, String pw, int studentId, String nickName, String introduction, Rank rank, String company, Job job, double adoptionRate) {
        super(logId, pw, studentId, nickName, introduction, rank);
        this.company = company;
        this.job = job;
        this.adoptionRate = 0;
    }

    /**
     * 현직자 정보를 수정한다.
     * @param pw
     * @param nickName
     * @param introduction
     * @param rank
     * @param job
     */
    public void updateWorker(String pw, String nickName, String introduction, Rank rank, Job job) {
        this.updateUser(pw, nickName, introduction, rank);
        this.job = job;
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
