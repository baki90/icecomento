package ice.comento.board.domain;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class Photos {
    private List<String> photos;
}
