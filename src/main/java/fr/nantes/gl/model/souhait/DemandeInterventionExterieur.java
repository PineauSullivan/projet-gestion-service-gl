package fr.nantes.gl.model.souhait;

import fr.nantes.gl.model.enseignant.Enseignant;

import java.util.Date;

public class DemandeInterventionExterieur extends Demande {
    private String organisation = "";

    public DemandeInterventionExterieur(Enseignant enseignant, Boolean publie, Date heures, String organisation) {
        super(enseignant, publie, heures);
        this.organisation = organisation;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }
}
