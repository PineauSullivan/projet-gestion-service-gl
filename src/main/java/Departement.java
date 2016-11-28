import java.util.ArrayList;

/**
 * Created by Sébastien on 28/11/2016.
 */
public class Departement {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    private String nom;

    @OneToMany(mappedBy = "departement")
    private ArrayList<Enseignant> listeDesEnseignants;
}
