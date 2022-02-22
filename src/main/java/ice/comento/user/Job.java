package ice.comento.user;

import ice.comento.model.BaseEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "job")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Job extends BaseEntity {
    private String job;

    @OneToMany(mappedBy = "job",fetch = FetchType.LAZY)
    private Set<Interests> interests = new LinkedHashSet<>();

    @OneToMany(mappedBy = "job",fetch = FetchType.LAZY)
    private List<Worker> workerList=new ArrayList<>();
}
