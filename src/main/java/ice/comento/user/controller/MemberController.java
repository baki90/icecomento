package ice.comento.user.controller;

import ice.comento.user.dto.IceStudentCreateDTO;
import ice.comento.user.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/api/member/icestudent")
    public ResponseEntity createIceStudent(@RequestBody IceStudentCreateDTO createDTO){
        return memberService.createIceStudent(createDTO);
    }
}
