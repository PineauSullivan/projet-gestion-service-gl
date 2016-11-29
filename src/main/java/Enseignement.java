import javax.persistence.ManyToOne;
import java.util.ArrayList;

/**
 * Created by E124533M on 07/11/16.
 */
public class Enseignement {

    private int volume;

    @ManyToOne
    private Module module;


}
