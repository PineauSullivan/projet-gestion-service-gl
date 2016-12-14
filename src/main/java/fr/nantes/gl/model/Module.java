package fr.nantes.gl.model;

import java.util.HashSet;
import java.util.Set;

public class Module {

    private String nom;
    
    private Parcours parcours;

    private Set<Enseignement> enseignements;

    public Module(String nom){
        this.nom = nom;
        enseignements = new HashSet<Enseignement>();
    }

    public void setParcours(Parcours d){
        parcours = d;
    }

    public void unsetParcours(){
        parcours = null;
    }

    public boolean ajouterEnseignements(Enseignement e){
        return enseignements.add(e);
    }

    public boolean supprimerEnseignements(Enseignement e){
        return enseignements.remove(e);
    }

    public Parcours getParcours(){
        return parcours;
    }

    public String getNom() {
        return nom;
    }

    public Set<Enseignement> getEnseignements() {
        return enseignements;
    }
}
