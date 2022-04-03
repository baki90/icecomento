package ice.comento.board.service;

import ice.comento.board.domain.Board;
import ice.comento.board.dto.PostDto;
import ice.comento.board.repository.BoardRepository;
import ice.comento.user.domain.Member;
import ice.comento.user.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    /**
     *
     * @apiNote
     * 테스트 아직 안했음 절대 돌리지 마33333333333
     * @param postDto
     * @return 지금 돌리면 응가투척
     */
    public ResponseEntity<String> createPost(PostDto postDto){
        String writer_id = postDto.getWriter_id();
        Member member = memberRepository.findByLogId(writer_id);

        Board board=Board.createPost(postDto.getCategory(), member, postDto.getTitle(),
                postDto.getContents(),postDto.getPhotos(),postDto.getHashTags());

        boardRepository.save(board);

        log.info("게시글이 등록되었습니다.");
        return ResponseEntity.ok().body("게시글이 등록되었습니다.");
    }

}
