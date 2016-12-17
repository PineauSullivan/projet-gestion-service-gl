package fr.nantes.gl.model.enseignant;

import fr.nantes.gl.model.departement.Departement;
import fr.nantes.gl.model.souhait.Demande;

import javax.persistence.*;
import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Enseignant {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @ManyToOne
    private Departement departement;

    private String _nom;
    private String _prenom;
    private String statut;

    @ManyToOne
    private Contrat contrat;

    @OneToMany(mappedBy= "enseignant")
    private ArrayList<Demande> _listeDesVoeux;

    public Enseignant(Departement departement, String _nom, String _prenom, String statut, Contrat contrat) {
        this.departement = departement;
        this._nom = _nom;
        this._prenom = _prenom;
        this.statut = statut;
        this.contrat = contrat;
    }

    public void addDemande(Demande demande){
        _listeDesVoeux.add(demande);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String get_nom() {
        return _nom;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public String get_prenom() {
        return _prenom;
    }

    public void set_prenom(String _prenom) {
        this._prenom = _prenom;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public ArrayList<Demande> get_listeDesVoeux() {
        return _listeDesVoeux;
    }

    public void set_listeDesVoeux(ArrayList<Demande> _listeDesVoeux) {
        this._listeDesVoeux = _listeDesVoeux;
    }
}
