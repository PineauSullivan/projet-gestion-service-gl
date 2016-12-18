package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Enseignant;
import fr.nantes.gl.model.intervention.InterventionAuDepartement;

import java.util.Date;
import java.util.HashSet;
/**
 * Classe pour gérer des voeux
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Voeu extends Demande {
    /**
     * intervention Au Departements du voeu
     */
    private HashSet<InterventionAuDepartement> interventionAuDepartements = new HashSet<InterventionAuDepartement>();

    /**
     * preference du voeu
     */
    private Integer preference = Integer.valueOf(0);

    /**
     * enseignement du voeu
     */
    private Enseignement enseignement = null;

    /**
     * Constructeur de la demande Speciale
     * @param enseignant : Enseignant
     * @param publie : Boolean
     * @param heures : Date
     * @param preference : Integer
     * @param enseignement : Enseignement
     */
    public Voeu(Enseignant enseignant, Boolean publie, Date heures, Integer preference, Enseignement enseignement) {
        super(enseignant, publie, heures);
        this.preference = preference;
        this.enseignement = enseignement;
    }

    /**
     * Getter de intervention Au Departements
     * @return HashSet<InterventionAuDepartement>
     */
    public HashSet<InterventionAuDepartement> getInterventionAuDepartements() {
        return interventionAuDepartements;
    }

    /**
     * Setter de l'intervention Au Departements
     * @param interventionAuDepartements : HashSet<InterventionAuDepartement>
     */
    public void setInterventionAuDepartements(HashSet<InterventionAuDepartement> interventionAuDepartements) {
        this.interventionAuDepartements = interventionAuDepartements;
    }

    /**
     * Procedure permettant d'ajouter une intervention dans interventionAuDepartements
     * @param intervention : InterventionAuDepartement
     */
    public void addIntervention(InterventionAuDepartement intervention) {
        this.interventionAuDepartements.add(intervention);
    }

    /**
     * Getter de la preference
     * @return preference
     */
    public Integer getPreference() {
        return preference;
    }

    /**
     * Setter de la preference
     * @param preference : Integer
     */
    public void setPreference(Integer preference) {
        this.preference = preference;
    }

    /**
     * Getter de la enseignement
     * @return enseignement
     */
    public Enseignement getEnseignement() {
        return enseignement;
    }

    /**
     * Setter de l'enseignement
     * @param enseignement : Enseignement
     */
    public void setEnseignement(Enseignement enseignement) {
        this.enseignement = enseignement;
    }
}
