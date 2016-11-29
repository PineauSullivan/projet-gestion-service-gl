import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by Sébastien on 28/11/2016.
 */
public class Contrat {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @OneToMany(mappedBy="contrat")
    private ArrayList<Enseignant> enseignants;


    private int MIN;
    private int MAX;


}
