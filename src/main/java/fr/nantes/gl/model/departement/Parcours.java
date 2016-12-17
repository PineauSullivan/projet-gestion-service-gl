package fr.nantes.gl.model.departement;

import java.util.HashSet;
import java.util.Set;

public class Parcours {
    
    private String nom;
    
    private Departement departement;
    
    private Set<Module> modules;
    
    public Parcours(String nom){
        this.nom = nom;
        modules = new HashSet<Module>();
    }
    
    public void setDepartement(Departement d){
        departement = d;
    }
    
    public void unsetDepartement(){
        departement = null;
    }

    public boolean ajouterModules(Module m){
        if(m.getParcours() == null){
            if(modules.add(m)){
                m.setParcours(this);
                return true;
            }
        }
        return false;
    }

    public boolean supprimerModules(Module m){
        if(modules.remove(m)){
            m.unsetParcours();
            return true;
        }
        return false;
    }

    public Departement getDepartement(){
        return departement;
    }

    public String getNom() {
        return nom;
    }

    public Set<Module> getModules() {
        return modules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parcours parcours = (Parcours) o;

        return nom.equals(parcours.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}