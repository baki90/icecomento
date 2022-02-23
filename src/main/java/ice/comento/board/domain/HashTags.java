package ice.comento.board.domain;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class HashTags {
    private List<String> hashTags;
}
