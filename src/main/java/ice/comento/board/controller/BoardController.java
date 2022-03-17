package ice.comento.board.controller;

import ice.comento.board.dto.PostDto;
import ice.comento.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardRepository boardRepository;

    @PostMapping("/")
    public ResponseEntity<String> createPost(@Valid @RequestBody PostDto postDto){


        return ResponseEntity.ok().body("게시글이 등록되었습니다.");
    }

}
