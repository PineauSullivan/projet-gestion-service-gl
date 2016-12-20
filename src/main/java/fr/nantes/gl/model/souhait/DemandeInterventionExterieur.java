package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.enseignant.Enseignant;

import java.util.Date;
/**
 * Classe pour gérer les demandes d'Intervention Exterieur
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class DemandeInterventionExterieur extends Demande {
    /**
     * organisation de la Demande Intervention Exterieur
     */
    private String organisation = "";

    /**
     * Constructeur de la Demande Intervention Exterieur
     * @param publie : Boolean
     * @param heures : Date
     * @param organisation : String
     */
    public DemandeInterventionExterieur(Boolean publie, Date heures, String organisation) {
        super(publie, heures);
        this.organisation = organisation;
    }

    /**
     * Getter de l'organisation
     * @return String
     */
    public String getOrganisation() {
        return organisation;
    }

    /**
     * Setter de l'organisation
     * @param organisation : String
     */
    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }
}
