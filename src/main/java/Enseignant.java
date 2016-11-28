import java.util.ArrayList;

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
    private Boolean statut;

    @OneToMany(mappedBy= "enseignant")
    private ArrayList<Demande> _listeDesVoeux;
}
