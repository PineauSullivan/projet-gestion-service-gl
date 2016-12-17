package fr.nantes.gl.model.enseignant;

import fr.nantes.gl.model.intervention.Intervention;

import java.util.HashSet;

/**
 * Created by Sébastien on 29/11/2016.
 */
public class Service {
    public Integer annee = Integer.valueOf(0);
    public HashSet<Intervention> interventions = new HashSet<Intervention>();
    public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
    public Integer volume = Integer.valueOf(0);

    public Service() {
        super();
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public HashSet<Intervention> getInterventions() {
        return interventions;
    }

    public void setInterventions(HashSet<Intervention> interventions) {
        this.interventions = interventions;
    }

    public HashSet<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(HashSet<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
