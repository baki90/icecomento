package ice.comento.user;

import ice.comento.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/**
 * @author jeong-yeonhee
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Worker extends User {

    private String company;

   @ManyToOne
   @JoinColumn(name="job_id")
   private Job job;


    /* @OneToMany(mappedBy = "answer_id",fetch = FetchType.LAZY)
    private List<Answer> answerList=new ArrayList<>();
    Answer 엔티티 만들어지면 연결
    근데 게시글 엔티티도 있어야 하는 것 아닌가에 대한 의문
    */
    private double adoptionRate;

}
