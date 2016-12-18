package fr.nantes.gl.model.departement;

import fr.nantes.gl.model.enseignant.Enseignant;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe pour gérer les départements
 * 
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */

public class Departement  implements Serializable {
    /**
     * Le nom du département
     */
    private String nom;

    /**
     * Le chef du département
     */
    private Enseignant chefDepartement;

    /**
     * La liste des enseignants
     */
    private Set<Enseignant> enseignants;

    /**
     * Ensemble des parcours
     */
    private Set<Parcours> parcours;

    /**
     * Constructeur de Departement
     * @param nom : String pour le nom du departement
     * @warning Aucun chef n'est attribué lors de la création
     */
    public Departement(String nom){
        this.nom = nom;
        enseignants = new HashSet<Enseignant>();
        parcours = new HashSet<Parcours>();
    }

    /**
     * @param enseignant : Enseignant à ajouter dans la liste enseignants
     * @return boolean true si l'ajout c'est bien déroulé
     */
    public boolean ajouterEnseignant(Enseignant enseignant){
        return enseignants.add(enseignant);
    }

    /**
     * @param enseignant : Enseignant à supprimer dans la liste enseignants
     * @return boolean true si la suppression c'est bien déroulé
     */
    public boolean supprimerEnseignant(Enseignant enseignant){
        return enseignants.remove(enseignant);
    }

    /**
     * @param parc : Parcours à ajouter
     * @return boolean true si l'ajout du parcours est possible
     */
    public boolean ajouterParcours(Parcours parc){
        if(parc.getDepartement() == null) {
            if(parcours.add(parc)) {
                parc.setDepartement(this);
                return true;
            }
        }
        return false;
    }

    /**
     * @param parc : Parcours à supprimer
     * @return boolean true si la suppression du parcours s'est réalisé
     */
    public boolean supprimerParcours(Parcours parc){
        if(parcours.remove(parc)){
            parc.unsetDepartement();
            return true;
        }
        return false;
    }

    /**
     * Getter pour le nom du département
     * @return un String
     */
    public String getNom(){
        return nom;
    }

    /**
     * Getter pour de la liste des Enseignants
     * @return un Set<Enseignant>
     */
    public Set<Enseignant> getEnseignants(){
        return enseignants;
    }

    /**
     * Getter pour de la liste des parcours
     * @return un Set<Parcours>
     */
    public Set<Parcours> getParcourss(){
        return parcours;
    }

    /**
     * @param o : Object
     * @return boolean true si l'objet est égal à this
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departement that = (Departement) o;

        return nom.equals(that.nom);
    }

    /**
     * @return un int qui est égal au hashCode du nom du département
     */
    @Override
    public int hashCode() {
        return nom.hashCode();
    }

    /**
     * @return un String
     */
    @Override
    public String toString(){
        return nom;
    }

    /**
     * @return un Enseignant : le chef du département
     */
    public Enseignant getChefEnseignant() {
        return chefDepartement;
    }

    /**
     * set le chef du département
     */
    public void setChefDepartement(Enseignant chefDepartement) {
        this.chefDepartement = chefDepartement;
    }

}
