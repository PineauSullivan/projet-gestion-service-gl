import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by Sébastien on 28/11/2016.
 */
@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    private String nom;

    @OneToMany(mappedBy = "departement")
    private ArrayList<Module> listeDesModules;

    @OneToMany(mappedBy = "departement")
    private ArrayList<Enseignant> listeDesEnseignants;


}
