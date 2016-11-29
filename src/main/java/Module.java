/**
 * Created by Sébastien on 28/11/2016.
 */
import javax.persistence.*;

import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;


@Entity
public class Module {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @ManyToOne
    private Parcours parcour;

    @ManyToMany
    private ArrayList<Enseignant> enseignants;

    @OneToMany(mappedBy= "module")
    private ArrayList<Enseignement> enseignements;
}
