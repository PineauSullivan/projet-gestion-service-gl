package fr.nantes.gl.model.intervention;

import fr.nantes.gl.model.souhait.Voeu;
/**
 * Classe pour gérer les Cas Interventions Au Departement
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class InterventionAuDepartement extends Intervention {
    /**
     * Voeu de l'intervention Au Departement
     */
    private Voeu voeu;

    /**
     * Constructeur de InterventionAuDepartement
     */
    public InterventionAuDepartement() {
        super();
    }

    /**
     * Getter du voeu
     * @return Voeu
     */
    public Voeu getVoeu() {
        return voeu;
    }

    /**
     * Setter du voeu
     * @param voeu : Voeu
     */
    public void setVoeu(Voeu voeu) {
        this.voeu = voeu;
    }
}
