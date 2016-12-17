package fr.nantes.gl.model.intervention;

import fr.nantes.gl.model.souhait.Voeu;

public class InterventionAuDepartement extends Intervention {

    private Voeu voeu;

    public InterventionAuDepartement() {
        super();
    }


    public Voeu getVoeu() {
        return voeu;
    }

    public void setVoeu(Voeu voeu) {
        this.voeu = voeu;
    }
}
