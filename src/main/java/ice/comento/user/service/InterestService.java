package ice.comento.user.service;

import ice.comento.user.domain.IceStudent;
import ice.comento.user.domain.Interest;
import ice.comento.user.domain.Member;
import ice.comento.user.domain.WorkField;
import ice.comento.user.repository.InterestsRepository;
import ice.comento.user.repository.WorkFieldRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class InterestService {
    private final InterestsRepository interestsRepository;
    private final WorkFieldRepository workFieldRepository;

    /**
     * 정통인이 관심 있는 업무 분야에 대한 정보를 저장한다.
     * @param iceStudent
     * @param workFieldIds
     */
    @Transactional
    public void addInterest(IceStudent iceStudent, Set<Long> workFieldIds) {
        // 관심 분야에 대한 정보 조회
        List<WorkField> workFields = workFieldRepository.findByIdIn(workFieldIds);

        // interest 객체 생성 후 저장
        List<Interest> interests = workFields.stream()
                .map(o -> Interest.of(iceStudent, o))
                .collect(Collectors.toList());

        interestsRepository.saveAll(interests);
    }
}
