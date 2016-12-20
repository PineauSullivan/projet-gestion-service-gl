package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.List;

/**
 * Interface pour gérer le Graphical User Interface d'un Enseignant
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public interface guiEnseignant {
    boolean emettreVoeu(Voeu voeu);
    List<Enseignement>  consulterEnseignements(boolean globalement, Demande demande);
    boolean publierSouhait(Demande demande);
    boolean emettreDemande(Demande demande);
    List<Enseignement> prendreConnaissanceCours();
    List<Service> afficherService(int mode);
    List<Enseignement> afficherDispo(String critere);
    String afficherAlerte();
    boolean modifierlistechoix(List<Demande> listeDesVoeux);
}
