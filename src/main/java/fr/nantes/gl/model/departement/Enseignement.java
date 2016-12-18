package fr.nantes.gl.model.departement;
/**
 * Classe pour gérer les Enseignements
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Enseignement {

    /**
     * Le module de l'enseignement
     */
    private Module module;

    /**
     * Le type de l'enseignement
     */
    private TypeEnseignement type;

    /**
     * le volume horaire
     */
    private int volume;

    /**
     * le nombre de groupe
     */
    private int nombre;

    /**
     * Constructeur de Enseignement
     * @param module : Module de l'enseignement
     * @param volume : int volume horaire de l'enseignement
     * @param nombre : int nombre de groupe de l'enseignement
     */
    public Enseignement(Module module, int volume, int nombre) {
        this.module = module;
        this.volume = volume;
        this.nombre = nombre;
    }

    /**
     * Setter du module  de l'enseignement
     * @param m : Module de l'enseignement
     */
    public void setModule(Module m){
        module = m;
    }

    /**
     * Unset du module  de l'enseignement
     */
    public void unsetModule(){
        module = null;
    }

    /**
     * Déclare le type de l'enseignement comme CM
     */
    public void declareAsCM(){
        type = TypeEnseignement.CM;
    }

    /**
     * Déclare le type de l'enseignement comme TD
     */
    public void declareAsTD(){
        type = TypeEnseignement.TD;
    }

    /**
     * Déclare le type de l'enseignement comme TP
     */
    public void declareAsTP(){
        type = TypeEnseignement.TP;
    }

    /**
     * @return boolean true si type de l'enseignement est un CM
     */
    public boolean estCM(){
        return type == TypeEnseignement.CM;
    }

    /**
     * @return boolean true si type de l'enseignement est un TD
     */
    public boolean estTD(){
        return type == TypeEnseignement.TD;
    }

    /**
     * @return boolean true si type de l'enseignement est un TP
     */
    public boolean estTP(){
        return type == TypeEnseignement.TP;
    }


    /**
     * @return Module de l'enseignement
     */
    public Module getModule(){
        return module;
    }

}
