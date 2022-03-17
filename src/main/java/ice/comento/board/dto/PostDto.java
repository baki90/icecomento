package ice.comento.board.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

/**
 * @author jeong-yeonhee
 */
@Data
public class PostDto {

    @NotBlank(message = "카테고리는 필수값입니다.")
    private String category;

    @NotBlank(message = "작성자는 필수값입니다.")
    private String writer_id;

    @NotBlank(message = "제목을 입력해주세요.")
    private String title;

    @NotBlank(message = "내용을 입력해주세요.")
    private String contents;

    private List<String> photos;

    private Set<String> hashTags;

}
