package fr.nantes.gl.model.departement;

import java.util.HashSet;
import java.util.Set;
/**
 * Classe pour gérer les Modules
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Module {
    /**
     * le nom du module
     */
    private String nom;

    /**
     * le parcours du module
     */
    private Parcours parcours;

    /**
     * Ensemble des enseignement
     */
    private Set<Enseignement> enseignements;

    /**
     * Constructeur de Module
     * @param nom : nom du module
     */
    public Module(String nom){
        this.nom = nom;
        enseignements = new HashSet<Enseignement>();
    }

    /**
     * Setter du parcours du module
     * @param d : Parcours du module
     */
    public void setParcours(Parcours d){
        parcours = d;
    }

    /**
     * unset du Parcours du module
     */
    public void unsetParcours(){
        parcours = null;
    }

    /**
     * @param e : Enseignement du module
     * @return boolean true si l'ajout de l'enseignment s'est bien passé
     */
    public boolean ajouterEnseignements(Enseignement e){
        if(e.getModule()==null) {
            if(enseignements.add(e)) {
                e.setModule(this);
                return true;
            }
        }
        return false;
    }

    /**
     * @param e : Enseignement du module
     * @return boolean true si la suppression de l'enseignement s'est bien passé
     */
    public boolean supprimerEnseignements(Enseignement e){
        if(e.getModule()==this) {
            if(enseignements.remove(e)){
                e.unsetModule();
                return true;
            }
        }
        return false;
    }

    /**
     * Getter pour le parcours du module
     * @return un Parcours
     */
    public Parcours getParcours(){
        return parcours;
    }

    /**
     * Getter pour le nom du module
     * @return un String
     */
    public String getNom() {
        return nom;
    }


    /**
     * @return les enseignements du Module
     */
    public Set<Enseignement> getEnseignements() {
        return enseignements;
    }

    /**
     * @param o : Object
     * @return boolean true si l'objet est égal à this
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Module module = (Module) o;

        return nom.equals(module.nom);
    }

    /**
     * @return un int qui est égal au hashCode du nom du Module
     */
    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
