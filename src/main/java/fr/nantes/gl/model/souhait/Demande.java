package fr.nantes.gl.model.souhait;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by Sébastien on 28/11/2016.
 */
public class Demande {
    @Id
    @GeneratedValue(strategy=AUTO)
    private int id;

    @ManyToOne
    Enseignant enseignant;

    Boolean publie;
    Date heures;
}
