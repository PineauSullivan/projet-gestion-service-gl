package fr.nantes.gl.model.enseignant;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

public class Contrat {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @OneToMany(mappedBy="contrat")
    private ArrayList<Enseignant> enseignants;


    private int MIN;
    private int MAX;


}
