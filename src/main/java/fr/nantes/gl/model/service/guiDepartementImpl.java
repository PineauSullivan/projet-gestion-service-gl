package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Departement;
import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Enseignant;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.lang.reflect.Array;
import java.util.List;
import java.util.List;

/**
 * Classe pour gérer le Graphical User Interface du Departement
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class guiDepartementImpl implements guiDepartement {
    /**
     * @return  List<Demande>,Récupération des choix des enseignants.

     */
    @Override
    public List<Demande> consulterVoeuxEnseignant(){
        return null;
    }

    /**
     * @param voeu : Voeu
     * @param enseignant : Enseignant
     * @return boolean, true si la publication s'est bien déroulé
     */
    @Override
    public boolean publierSouhait(Voeu voeu, Enseignant enseignant) {
        return false;
    }

    /**
     * @param departement : Departement
     * @return List<Demande>, des choix des enseignants en fonction d'un département
     */
    @Override
    public List<Demande> prendreConnaissanceCours(Departement departement) {
        return null;
    }

    /**
     * @return List<Enseignement>, liste des enseignements à couvrir
     */
    @Override
    public List<Enseignement> consulterEnseignementsACouvrir() {
        return null;
    }

    /**
     * @param mode : int qui correspond au mode choisis (1: globalement, 2: par modules, 3: par enseignants..)
     * @return  List<Service>, services suivant différent modes
     */
    @Override
    public List<Service> affichageService(int mode) {
        return null;
    }

    /**
     * @param enseignement : Enseignement
     * @param enseignant : Enseignant
     * @param publique : boolean
     * @return boolean, true si l'affectation d'un enseignement à un enseignant en mode publique s'est bien déroulé
     */
    @Override
    public boolean affecterEnseignantEnseignementPublic(Enseignant enseignant, Enseignement enseignement, boolean publique) {
        return false;
    }

    /**
     * @return String des Alertes concernant les conflits ...
     */
    @Override
    public String affichageAlerte() {
        return null;
    }

    /**
     * @param enseignementActuel : Enseignement
     * @param enseignementModifie : Enseignement
     * @param enseignant : Enseignant
     * @return boolean, true si la modification d'un enseignement par un autre pour un enseignant s'est bien déroulé
     */
    @Override
    public boolean modificationEnseignantEnseignementNonPublic(Enseignement enseignementActuel, Enseignement enseignementModifie, Enseignant enseignant) {
        return false;
    }

    /**
     * @param enseignement : Enseignement
     * @return boolean, true si l'ajout de l'enseignement s'est bien déroulé
     */
    @Override
    public boolean ajoutEnseignement(Enseignement enseignement){
        return false;
    }

    /**
     * @param enseignant : Enseignant
     * @return  boolean, true si l'ajout de l'enseignant s'est bien déroulé
     */
    @Override
    public boolean ajoutEnseignant(Enseignant enseignant){
        return false;
    }

    /**
     * @return  List<Enseignant>, liste de tous les enseignents
     */
    @Override
    public List<Enseignant> getEnseignents(){
        return null;
    }

}
