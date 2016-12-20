package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Departement;
import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Enseignant;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.ArrayList;

/**
 * Interface pour gérer les metiers du département
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public interface metiersDepartement {
    boolean emettreVoeu(Voeu voeu);
    boolean emettreDemande(Demande demande);
    String consulterEnseignement();
    boolean publierSouhait(Voeu voeu, Enseignant enseignant);
    ArrayList<Demande> prendreConnaissanceCours(Departement departement);
    ArrayList<Enseignement> consulterEnseignementsACouvrir();
    ArrayList<Service> affichageService(int mode);
    boolean affecterEnseignantEnseignementPublic(Enseignant enseignant, Enseignement enseignement, boolean publique);
    String affichageAlerte();
    boolean modificationEnseignantEnseignementNonPublic(Enseignement enseignementActuel, Enseignement enseignementModifie, Enseignant enseignant);
    boolean ajoutEnseignement(Enseignement enseignement);
    boolean ajoutEnseignant(Enseignant enseignant);
    String afficherAlerte(Enseignant enseignant);
    ArrayList<Enseignement> afficherDispo(String critere);
    ArrayList<Enseignant> getEnseignents();
}
