package fr.nantes.gl.model.departement;

import java.util.HashSet;
import java.util.Set;

public class Departement {

    private String nom;

    private Set<Enseignant> enseignants;

    private Set<Parcours> parcours;

    public Departement(String nom){
        this.nom = nom;
        enseignants = new HashSet<Enseignant>();
        parcours = new HashSet<Parcours>();
    }

    public boolean ajouterEnseignant(Enseignant e){
        return enseignants.add(e);
    }

    public boolean supprimerEnseignant(Enseignant e){
        return enseignants.remove(e);
    }

    public boolean ajouterParcours(Parcours e){
        if(e.getDepartement() == null) {
            if(parcours.add(e)) {
                e.setDepartement(this);
                return true;
            }
        }
        return false;
    }

    public boolean supprimerParcours(Parcours e){
        if(parcours.remove(e)){
            e.unsetDepartement();
            return true;
        }
        return false;
    }

    public String getNom(){
        return nom;
    }

    public Set<Enseignant> getEnseignants(){
        return enseignants;
    }

    public Set<Parcours> getParcourss(){
        return parcours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departement that = (Departement) o;

        return nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }

    @Override
    public String toString(){
        return nom;
    }
}
