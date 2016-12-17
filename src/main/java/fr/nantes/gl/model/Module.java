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
        if(e.getModule()==null) {
            if(enseignements.add(e)) {
                e.setModule(this);
                return true;
            }
        }
        return false;
    }

    public boolean supprimerEnseignements(Enseignement e){
        if(e.getModule()==this) {
            if(enseignements.remove(e)){
                e.unsetModule();
                return true;
            }
        }
        return false;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Module module = (Module) o;

        return nom.equals(module.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
