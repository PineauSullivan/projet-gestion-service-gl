package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.enseignant.Enseignant;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

public class Demande {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @ManyToOne
    Enseignant enseignant;

    Boolean publie;
    Date heures;

    public Demande(Enseignant enseignant, Boolean publie, Date heures) {
        this.enseignant = enseignant;
        this.publie = publie;
        this.heures = heures;
    }
}
