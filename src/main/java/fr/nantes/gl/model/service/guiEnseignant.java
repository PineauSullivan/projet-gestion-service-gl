package fr.nantes.gl.model.service;

import fr.nantes.gl.model.souhait.Voeu;

/**
 * Interface pour gérer le Graphical User Interface d'un Enseignant
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public interface guiEnseignant {
    void emettreVoeu(Voeu voeu);
}
