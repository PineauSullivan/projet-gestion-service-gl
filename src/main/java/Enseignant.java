import javax.persistence.*;
import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by E124533M on 07/11/16.
 */
@Entity
public class Enseignant {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @ManyToOne
    private Departement departement;

    private String _nom;
    private String _prenom;
    private String statut;

    @ManyToOne
    private Contrat contrat;

    @OneToMany(mappedBy= "enseignants")
    private ArrayList<Demande> _listeDesVoeux;
}
