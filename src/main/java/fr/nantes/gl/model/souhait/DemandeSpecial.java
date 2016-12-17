package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.enseignant.Enseignant;

import java.util.Date;

public class DemandeSpecial extends Demande {
    public DemandeSpecial(Enseignant enseignant, Boolean publie, Date heures) {
        super(enseignant, publie, heures);
    }
}
