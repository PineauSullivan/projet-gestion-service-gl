package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.ArrayList;

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
    ArrayList<Enseignement>  consulterEnseignements(boolean globalement, Demande demande);
    boolean publierSouhait(Demande demande);
    boolean emettreDemande(Demande demande);
    ArrayList<Enseignement> prendreConnaissanceCours();
    ArrayList<Service> afficherService(int mode);
    ArrayList<Enseignement> afficherDispo(String critere);
    String afficherAlerte();
    boolean modifierlistechoix(ArrayList<Demande> listeDesVoeux);
}