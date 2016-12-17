package fr.nantes.gl.model.enseignant;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

public class Contrat  implements Serializable {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @OneToMany(mappedBy="contrat")
    private ArrayList<Enseignant> enseignants;


    private int MIN;
    private int MAX;

    public Contrat(int MIN, int MAX) {
        this.MIN = MIN;
        this.MAX = MAX;
    }

    public void addEnseignant(Enseignant enseignant){
        enseignants.add(enseignant);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(ArrayList<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    public int getMIN() {
        return MIN;
    }

    public void setMIN(int MIN) {
        this.MIN = MIN;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
}
