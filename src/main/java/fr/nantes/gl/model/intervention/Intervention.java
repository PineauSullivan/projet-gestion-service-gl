package fr.nantes.gl.model.intervention;

public class Intervention {

    private Service service;
    private String volume;

    public Intervention() {
        super();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
