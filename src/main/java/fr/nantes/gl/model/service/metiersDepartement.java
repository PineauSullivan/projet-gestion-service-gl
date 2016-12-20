package fr.nantes.gl.model.service;

import fr.nantes.gl.model.departement.Departement;
import fr.nantes.gl.model.departement.Enseignement;
import fr.nantes.gl.model.enseignant.Enseignant;
import fr.nantes.gl.model.enseignant.Service;
import fr.nantes.gl.model.souhait.Demande;
import fr.nantes.gl.model.souhait.Voeu;

import java.util.List;

/**
 * Interface pour gérer les metiers du département
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public interface metiersDepartement {
    List<Demande> consulterVoeuxEnseignant();
    boolean publierSouhait(Voeu voeu, Enseignant enseignant);
    List<Demande> prendreConnaissanceCours(Departement departement);
    List<Enseignement> consulterEnseignementsACouvrir();
    List<Service> affichageService(int mode);
    boolean affecterEnseignantEnseignementPublic(Enseignant enseignant, Enseignement enseignement, boolean publique);
    String affichageAlerte();
    boolean modificationEnseignantEnseignementNonPublic(Enseignement enseignementActuel, Enseignement enseignementModifie, Enseignant enseignant);
    boolean ajoutEnseignement(Enseignement enseignement);
    boolean ajoutEnseignant(Enseignant enseignant);
    String afficherAlerte(Enseignant enseignant);
    List<Enseignement> afficherDispo(String critere);
    List<Enseignant> getEnseignents();
}
