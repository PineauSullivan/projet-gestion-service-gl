/**
 * Created by Sébastien on 28/11/2016.
 */
public class Demande {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    Enseignant enseignant;

    Boolean publie;
    Boolean heures;
}
