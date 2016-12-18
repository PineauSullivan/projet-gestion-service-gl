package fr.nantes.gl.model.enseignant;

import fr.nantes.gl.model.departement.Departement;
import fr.nantes.gl.model.souhait.Demande;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;
/**
 * Classe pour gérer les enseignants
 *
 * @author François Hallereau
 * @author Sebastien Vallée
 * @author Sullivan Pineau
 *
 */
@Entity
public class Enseignant  implements Serializable {
    /**
     * id de l'enseignant
     */
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    /**
     * département de l'enseignant
     */
    @ManyToOne
    private Departement departement;

    /**
     * nom de l'enseignant
     */
    private String _nom;

    /**
     * prenom de l'enseignant
     */
    private String _prenom;

    /**
     * status de l'enseignant
     */
    private String statut;

    /**
     * contrat de l'enseignant
     */
    @ManyToOne
    private Contrat contrat;

    /**
     * liste des voeux de l'enseignant
     */
    @OneToMany(mappedBy= "enseignant")
    private ArrayList<Demande> _listeDesVoeux;

    /**
     * Constructeur de Enseignant
     * @param departement : département de l'enseignant
     * @param _nom : nom de l'enseignant
     * @param _prenom : prenom de l'enseignant
     * @param statut : statut de l'enseignant
     * @param contrat : contrat de l'enseignant
     */
    public Enseignant(Departement departement, String _nom, String _prenom, String statut, Contrat contrat) {
        this.departement = departement;
        this._nom = _nom;
        this._prenom = _prenom;
        this.statut = statut;
        this.contrat = contrat;
    }

    /**
     * Procédure permetant d'ajouter une demande dans la liste des voeux
     * @param demande : Demande
     */
    public void addDemande(Demande demande){
        _listeDesVoeux.add(demande);
    }

    /**
     * Procédure permetant de supprimer une demande dans la liste des voeux
     * @param demande : Demande
     */
    public void removeDemande(Demande demande){
        _listeDesVoeux.remove(demande);
    }

    /**
     * Getter du id
     * @return int, id de l'enseignant
     */
    public int getId() {
        return id;
    }

    /**
     * Getter du departement de l'enseignant
     * @return Departement, departement de l'enseignant
     */
    public Departement getDepartement() {
        return departement;
    }

    /**
     * Setter du departement de l'enseignant
     * @param departement : Departement
     */
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    /**
     * Getter du nom de l'enseignant
     * @return String, nom de l'enseignant
     */
    public String get_nom() {
        return _nom;
    }

    /**
     * Setter du nom de l'enseignant
     * @param _nom : String
     */
    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    /**
     * Getter du prenom de l'enseignant
     * @return String, prenom de l'enseignant
     */
    public String get_prenom() {
        return _prenom;
    }

    /**
     * Setter du prenom de l'enseignant
     * @param _prenom : String
     */
    public void set_prenom(String _prenom) {
        this._prenom = _prenom;
    }

    /**
     * Getter du status de l'enseignant
     * @return String, statut de l'enseignant
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Setter du statut de l'enseignant
     * @param statut : String
     */
    public void setStatut(String statut) {
        this.statut = statut;
    }

    /**
     * Getter du contrat de l'enseignant
     * @return Contrat, contrat de l'enseignant
     */
    public Contrat getContrat() {
        return contrat;
    }

    /**
     * Setter du contrat de l'enseignant
     * @param contrat : Contrat
     */
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    /**
     * Getter de la liste Des Voeux de l'enseignant
     * @return  ArrayList<Demande>
     */
    public ArrayList<Demande> get_listeDesVoeux() {
        return _listeDesVoeux;
    }

}
