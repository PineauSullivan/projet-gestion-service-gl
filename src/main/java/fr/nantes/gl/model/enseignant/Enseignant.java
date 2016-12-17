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
}
