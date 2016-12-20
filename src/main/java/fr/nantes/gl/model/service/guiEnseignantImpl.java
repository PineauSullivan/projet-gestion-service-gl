package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.ArrayList;

/**
 * Classe pour gérer le Graphical User Interface d'un Enseignant
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class guiEnseignantImpl  implements guiEnseignant {
    /**
     * @param voeu : Voeu
     * @return boolean, true si l'emission s'est bien déroulé
     */
    @Override
    public boolean emettreVoeu(Voeu voeu) {
        return false;
    }

    /**
     * @param globalement : boolean true si globalement ou à la demande
     * @return ArrayList<Enseignement>, Récupération des choix des autres enseignants (globalement ou à la demande).
     */
    @Override
    public ArrayList<Enseignement> consulterEnseignements(boolean globalement, Demande demande) {
        return null;
    }

    /**
     * @param demande : Demande
     * @return boolean, true si la publication c'est bien déroulé (rendre publique)
     */
    @Override
    public boolean publierSouhait(Demande demande) {
        return false;
    }

    /**
     * @param demande : Demande
     * @return boolean, true si l'emission de la demande s'est bien déroulé (emettre un souhait)
     */
    @Override
    public boolean emettreDemande(Demande demande) {
        return false;
    }

    /**
     * @return  ArrayList<Enseignement> listes des cours qui leur ont été affectés pour les préparer, les assurer
     */
    @Override
    public ArrayList<Enseignement> prendreConnaissanceCours() {
        return null;
    }

    /**
     * @param mode : int qui correspond au mode choisis (1: globalement, 2: par modules, 3: par enseignants..)
     * @return  ArrayList<Service> qui correspond aux services en fonction du mode choisis
     */
    @Override
    public ArrayList<Service> afficherService(int mode) {
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
     * @return String des Alertes concernant les conflits ...
     */
    @Override
    public String afficherAlerte() {
        return null;
    }

    /**
     * @param listeDesVoeux : ArrayList<Demande>
     * @return  boolean, true si la modification de la listedesvoeux s'est bien déroulé
     */
    @Override
    public boolean modifierlistechoix(ArrayList<Demande> listeDesVoeux) {
        return false;
    }
}
