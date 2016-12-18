package fr.nantes.gl.model.enseignant;

import fr.nantes.gl.model.intervention.Intervention;

import java.util.HashSet;
/**
 * Classe pour gérer les service
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Service {
    /**
     * année du service
     */
    public Integer annee = Integer.valueOf(0);

    /**
     * interventions du service
     */
    public HashSet<Intervention> interventions = new HashSet<Intervention>();

    /**
     * enseignants du service
     */
    public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();

    /**
     * volume horaire du service
     */
    public Integer volume = Integer.valueOf(0);

    /**
     * Constructeur de Service
     */
    public Service() {
        super();
    }

    /**
     * Getter de l'année
     * @return Integer
     */
    public Integer getAnnee() {
        return annee;
    }

    /**
     * Setter de l'année
     * @param annee : Integer
     */
    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    /**
     * Getter des interventions
     * @return HashSet<Intervention>
     */
    public HashSet<Intervention> getInterventions() {
        return interventions;
    }

    /**
     * Setter interventions
     * @param interventions : HashSet<Intervention>
     */
    public void setInterventions(HashSet<Intervention> interventions) {
        this.interventions = interventions;
    }

    /**
     * Getter des enseignants
     * @return HashSet<Enseignant>
     */
    public HashSet<Enseignant> getEnseignants() {
        return enseignants;
    }

    /**
     * Setter enseignants
     * @param enseignants : HashSet<Enseignant>
     */
    public void setEnseignants(HashSet<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    /**
     * Getter du volume horaire
     * @return Integer
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * Setter du volume horaire
     * @param volume : Integer
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
