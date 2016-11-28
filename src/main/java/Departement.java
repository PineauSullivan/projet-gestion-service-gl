import java.util.ArrayList;

/**
 * Created by Sébastien on 28/11/2016.
 */
public class Departement {
    private String nom;

    @OneToMany(mappedBy = "departement")
    private ArrayList<Enseignant> listeDesEnseignants;
}
