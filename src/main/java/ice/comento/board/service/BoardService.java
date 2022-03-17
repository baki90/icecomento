package ice.comento.board.service;

import ice.comento.board.domain.Board;
import ice.comento.board.dto.PostDto;
import ice.comento.board.repository.BoardRepository;
import ice.comento.user.domain.User;
import ice.comento.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    public ResponseEntity<String> createPost(PostDto postDto){
        String writer_id = postDto.getWriter_id();
        User user = userRepository.findByLogId(writer_id);

        Board board=Board.createPost(postDto.getCategory(),user, postDto.getTitle(),
                postDto.getContents(),postDto.getPhotos(),postDto.getHashTags());

        boardRepository.save(board);

        return ResponseEntity.ok().body("게시글이 등록되었습니다.");
    }

}
