package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.List;

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
     * @return List<Enseignement>, Récupération des choix des autres enseignants (globalement ou à la demande).
     */
    @Override
    public List<Enseignement> consulterEnseignements(boolean globalement, Demande demande) {
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
     * @return  List<Enseignement> listes des cours qui leur ont été affectés pour les préparer, les assurer
     */
    @Override
    public List<Enseignement> prendreConnaissanceCours() {
        return null;
    }

    /**
     * @param mode : int qui correspond au mode choisis (1: globalement, 2: par modules, 3: par enseignants..)
     * @return  List<Service> qui correspond aux services en fonction du mode choisis
     */
    @Override
    public List<Service> afficherService(int mode) {
        return null;
    }

    /**
     * @param critere : String
     * @return  List<Enseignement> qui correspond a la liste des Enseignement disponible
     */
    @Override
    public List<Enseignement> afficherDispo(String critere) {
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
     * @param listeDesVoeux : List<Demande>
     * @return  boolean, true si la modification de la listedesvoeux s'est bien déroulé
     */
    @Override
    public boolean modifierlistechoix(List<Demande> listeDesVoeux) {
        return false;
    }
}
