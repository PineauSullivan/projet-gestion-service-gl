package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Departement;
import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Enseignant;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.ArrayList;

/**
 * Classe pour gérer les metiers du département
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class metiersDepartementImpl  implements metiersDepartement {
    /**
     * @param voeu : Voeu
     * @return boolean, true si l'emission s'est bien déroulé
     */
    @Override
    public boolean emettreVoeu(Voeu voeu) {
        return false;
    }

    /**
     * @param demande : Demande
     * @return boolean, true si l'emission s'est bien déroulé
     */
    @Override
    public boolean emettreDemande(Demande demande) {
        return false;
    }


    @Override
    public String consulterEnseignement() {
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
     * @return ArrayList<Demande>, des choix des enseignants en fonction d'un département
     */
    @Override
    public ArrayList<Demande> prendreConnaissanceCours(Departement departement) {
        return null;
    }

    /**
     * @return ArrayList<Enseignement>, liste des enseignements à couvrir
     */
    @Override
    public ArrayList<Enseignement> consulterEnseignementsACouvrir() {
        return null;
    }

    /**
     * @param mode : int qui correspond au mode choisis (1: globalement, 2: par modules, 3: par enseignants..)
     * @return  ArrayList<Service>, services suivant différent modes
     */
    @Override
    public ArrayList<Service> affichageService(int mode) {
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
     * @return String, permettant d'afficher tout les alertes conflit .. d'un enseignant
     */
    @Override
    public String afficherAlerte(Enseignant enseignant){
        return null;
    }

    /**
     * @param critere : String
     * @return  ArrayList<Enseignement> qui correspond a la liste des Enseignement disponible
     */
    @Override
    public ArrayList<Enseignement> afficherDispo(String critere) {
        return null;
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
     * @return  ArrayList<Enseignant>, liste de tous les enseignents
     */
    @Override
    public ArrayList<Enseignant> getEnseignents(){
        return null;
    }
}
