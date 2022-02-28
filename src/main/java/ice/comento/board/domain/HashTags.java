package ice.comento.board.domain;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import java.util.List;

@Embeddable
public class HashTags {

    @ElementCollection
    @CollectionTable(name = "tag",
            joinColumns = @JoinColumn(name = "board_id"))
    private List<String> hashTags;
}
