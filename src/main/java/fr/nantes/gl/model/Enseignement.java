package fr.nantes.gl.model;

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

    public Enseignement(Module m){
        module = m;
    }

    public void setModule(Module m){
        module = m;
    }

    public void unsetModule(){
        module = null;
    }

    public void declareAsCM(){
        type = TypeEnseignement.CM;
    }

    public void declareAsTD(){
        type = TypeEnseignement.TD;
    }

    public void declareAsTP(){
        type = TypeEnseignement.TP;
    }

    public boolean estCM(){
        return type == TypeEnseignement.CM;
    }

    public boolean estTD(){
        return type == TypeEnseignement.TD;
    }

    public boolean estTP(){
        return type == TypeEnseignement.TP;
    }

    public Module getModule(){
        return module;
    }


}
