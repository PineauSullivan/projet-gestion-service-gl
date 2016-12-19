package fr.nantes.gl.model.service;

import fr.nantes.gl.model.souhait.Voeu;

/**
 * Interface pour gérer la persistance des Enseignants
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public interface persistanceEnseignant {
    void emettreVoeu(Voeu voeu);
}
