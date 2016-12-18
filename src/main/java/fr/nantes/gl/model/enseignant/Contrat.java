package fr.nantes.gl.model.enseignant;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;
/**
 * Classe pour gérer les Contrat
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
public class Contrat  implements Serializable {
    /**
     * id du Contrat
     */
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    /**
     * Liste des enseignants
     */
    @OneToMany(mappedBy="contrat")
    private ArrayList<Enseignant> enseignants;

    /**
     * MIN heures du Contrat
     */
    private int MIN;

    /**
     * MAX heures du Contrat
     */
    private int MAX;

    /**
     * Constructeur de Departement
     * @param MIN : Minimum d'heure du contrat
     * @param MAX : Maximum d'heure du contrat
     */
    public Contrat(int MIN, int MAX) {
        this.MIN = MIN;
        this.MAX = MAX;
    }

    /**
     * Procédure permetant d'ajouter un enseignant dans la listes des enseignants
     * @param enseignant : Enseignant
     */
    public void addEnseignant(Enseignant enseignant){
        enseignants.add(enseignant);
    }

    /**
     * Getter du id
     * @return int, id du contrat
     */
    public int getId() {
        return id;
    }

    /**
     * Getter de la liste enseignants
     * @return ArrayList<Enseignant>
     */
    public ArrayList<Enseignant> getEnseignants() {
        return enseignants;
    }

    /**
     * Suppression d'un enseignant dans la liste enseignants
     */
    public void removeEnseignant(Enseignant enseignant) {
        enseignants.remove(enseignant);
    }

    /**
     * Getter du minimum d'heures du contrat
     * @return int
     */
    public int getMIN() {
        return MIN;
    }

    /**
     * Setter du minimum d'heures du contrat
     * @param MIN : int minimum d'heures du contrat
     */
    public void setMIN(int MIN) {
        this.MIN = MIN;
    }

    /**
     * Getter du maximum d'heure du contrat
     * @return int
     */
    public int getMAX() {
        return MAX;
    }

    /**
     * Setter du maximum d'heures du contrat
     * @param MAX : int maximum d'heures du contrat
     */
    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
}
