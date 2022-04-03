package ice.comento.user.service;

import ice.comento.user.domain.IceStudent;
import ice.comento.user.dto.IceStudentCreateDTO;
import ice.comento.user.repository.MemberRepository;
import ice.comento.user.repository.WorkFieldRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 회원 관련 로직 수행
 */
@Service
@AllArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final WorkFieldRepository workFieldRepository;

    private final InterestService interestService;

    /**
     * 정통인 회원 가입
     *
     * @param createDTO
     * @return
     */
    @Transactional
    public ResponseEntity createIceStudent(IceStudentCreateDTO createDTO) {
        // 정통인 정보 생성
        IceStudent iceStudent = IceStudent.builder()
                .logId(createDTO.getLogId())
                .pw(createDTO.getPw())
                .studentId(createDTO.getStudentId())
                .nickName(createDTO.getNickName())
                .studentStatus(createDTO.getStudentStatus())
                .introduction(createDTO.getIntroduction())
                .build();

        // 정통인 관심 분야 저장
        interestService.addInterest(iceStudent, createDTO.getWorkFieldIds());
        memberRepository.save(iceStudent);

        return ResponseEntity.ok().build();
    }


}
