/**
 * Created by Sébastien on 28/11/2016.
 */
public class Demande {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @ManyToOne
    Enseignant enseignant;

    Boolean publie;
    Boolean heures;
}
