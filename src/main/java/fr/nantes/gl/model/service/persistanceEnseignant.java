package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.List;

/**
 * Interface pour gérer la persistance des Enseignants
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public interface persistanceEnseignant {
    boolean emettreVoeu(Voeu voeu);
    boolean publierSouhait(Demande demande);
    boolean emettreDemande(Demande demande);
    boolean modifierlistechoix(List<Demande> listeDesVoeux);
    boolean sauvegarderEnseignementEnseignant(Enseignement enseignement);
    List<Demande> voirDemandes();
}
