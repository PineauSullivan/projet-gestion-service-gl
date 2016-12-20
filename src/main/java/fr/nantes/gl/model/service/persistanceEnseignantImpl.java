package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.List;

/**
 * Classe pour gérer la persistance des Enseignants
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class persistanceEnseignantImpl implements  persistanceEnseignant{
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
     * @param listeDesVoeux : List<Demande>
     * @return  boolean, true si la modification de la listedesvoeux s'est bien déroulé
     */
    @Override
    public boolean modifierlistechoix(List<Demande> listeDesVoeux) {
        return false;
    }

    /**
     * @param enseignement : Enseignement
     * @return  boolean, true si la sauvegarde d'un Enseignement
     */
    @Override
    public boolean sauvegarderEnseignementEnseignant(Enseignement enseignement){
        return false;
    }

    /**
     * @return  List<Demande> de l'enseignant enregistrer dans la base donnée
     */
    @Override
    public List<Demande> voirDemandes(){
        return null;
    }

}
