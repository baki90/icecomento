package ice.comento.board.service;

import ice.comento.board.dto.PostDto;
import ice.comento.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public ResponseEntity<String> createPost(PostDto postDto){
        //작성자 아이디에 따른 유저 정보 불러오기

        return ResponseEntity.ok().body("게시글이 등록되었습니다.");
    }

}
