package fr.nantes.gl.model.intervention;

import fr.nantes.gl.model.enseignant.Service;
/**
 * Classe pour gérer les interventions
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Intervention {
    /**
     * Service de l'intervention
     */
    private Service service;

    /**
     * volume de l'intervention
     */
    private String volume;

    /**
     * Constructeur de Intervention
     */
    public Intervention() {
        super();
    }

    /**
     * Getter du service
     * @return Service
     */
    public Service getService() {
        return service;
    }

    /**
     * Setter du service
     * @param service : Service
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * Getter du volume
     * @return String
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Setter du volume
     * @param volume : String
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }
}
