/**
 * Created by Sébastien on 28/11/2016.
 */
@Entity
public class Module {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @ManyToOne
    private Parcours parcour;

    private String _nom;
}
