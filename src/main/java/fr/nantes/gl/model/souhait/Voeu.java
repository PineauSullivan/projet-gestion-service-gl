package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Enseignant;
import fr.nantes.gl.model.intervention.InterventionAuDepartement;

import java.util.Date;
import java.util.HashSet;

public class Voeu extends Demande {

    private HashSet<InterventionAuDepartement> interventionAuDepartements = new HashSet<InterventionAuDepartement>();
    private Integer preference = Integer.valueOf(0);
    private Enseignement enseignement = null;

    public Voeu(Enseignant enseignant, Boolean publie, Date heures, Integer preference, Enseignement enseignement) {
        super(enseignant, publie, heures);
        this.preference = preference;
        this.enseignement = enseignement;
    }

    public HashSet<InterventionAuDepartement> getInterventionAuDepartements() {
        return interventionAuDepartements;
    }

    public void setInterventionAuDepartements(HashSet<InterventionAuDepartement> interventionAuDepartements) {
        this.interventionAuDepartements = interventionAuDepartements;
    }

    public void addIntervention(InterventionAuDepartement intervention) {
        this.interventionAuDepartements.add(intervention);
    }

    public Integer getPreference() {
        return preference;
    }

    public void setPreference(Integer preference) {
        this.preference = preference;
    }

    public Enseignement getEnseignement() {
        return enseignement;
    }

    public void setEnseignement(Enseignement enseignement) {
        this.enseignement = enseignement;
    }
}
