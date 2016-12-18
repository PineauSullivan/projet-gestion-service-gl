package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.enseignant.Enseignant;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;
/**
 * Classe pour gérer les demandes
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Demande {
    /**
     * id de la Demande
     */
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    /**
     * enseignant de la Demande
     */
    @ManyToOne
    Enseignant enseignant;

    /**
     * Boolean pour savoir la Demande est public
     */
    Boolean publie;

    /**
     * heures de la demande
     */
    Date heures;

    /**
     * Constructeur de la Demande
     * @param enseignant : Enseignant
     * @param publie : Boolean
     * @param heures : Date
     */
    public Demande(Enseignant enseignant, Boolean publie, Date heures) {
        this.enseignant = enseignant;
        this.publie = publie;
        this.heures = heures;
    }
}
