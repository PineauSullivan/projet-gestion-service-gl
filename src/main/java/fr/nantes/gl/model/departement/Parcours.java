package fr.nantes.gl.model.departement;

import java.util.HashSet;
import java.util.Set;
/**
 * Classe pour gérer les Parcours
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Parcours {
    /**
     * le nom du parcours
     */
    private String nom;

    /**
     * le département du parcours
     */
    private Departement departement;

    /**
     * ensemble des modules du parcours
     */
    private Set<Module> modules;

    /**
     * Constructeur de Parcours
     * @param nom : nom du parcours
     */
    public Parcours(String nom){
        this.nom = nom;
        modules = new HashSet<Module>();
    }

    /**
     * Setter du département du parcours
     * @param d : Departement du parcours
     */
    public void setDepartement(Departement d){
        departement = d;
    }

    /**
     * Unset du département du parcours
     */
    public void unsetDepartement(){
        departement = null;
    }

    /**
     * @param m : Module du parcours
     * @return boolean true si l'ajout du Module s'est bien passé
     */
    public boolean ajouterModules(Module m){
        if(m.getParcours() == null){
            if(modules.add(m)){
                m.setParcours(this);
                return true;
            }
        }
        return false;
    }

    /**
     * @param m : Module du parcours
     * @return boolean true si la suppression du module s'est bien passé
     */
    public boolean supprimerModules(Module m){
        if(modules.remove(m)){
            m.unsetParcours();
            return true;
        }
        return false;
    }

    /**
     * Getter du département
     * @return Departement du parcours
     */
    public Departement getDepartement(){
        return departement;
    }

    /**
     * Getter du nom
     * @return String, le nom du parcours
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter du nom
     * @return ensemble des modules du parcours
     */
    public Set<Module> getModules() {
        return modules;
    }

    /**
     * @param o : Object
     * @return boolean true si l'objet est égal à this
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parcours parcours = (Parcours) o;

        return nom.equals(parcours.nom);
    }

    /**
     * @return un int qui est égal au hashCode du nom du parcours
     */
    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
