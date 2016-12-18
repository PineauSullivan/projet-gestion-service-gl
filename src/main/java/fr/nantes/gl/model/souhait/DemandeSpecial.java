package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.enseignant.Enseignant;

import java.util.Date;
/**
 * Classe pour gérer les demandes Speciales
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class DemandeSpecial extends Demande {

    /**
     * Constructeur de la demande Speciale
     * @param enseignant : Enseignant
     * @param publie : Boolean
     * @param heures : Date
     */
    public DemandeSpecial(Enseignant enseignant, Boolean publie, Date heures) {
        super(enseignant, publie, heures);
    }
}
