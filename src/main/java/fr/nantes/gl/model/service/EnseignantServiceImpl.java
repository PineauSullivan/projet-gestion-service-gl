package fr.nantes.gl.model.service;

import fr.nantes.gl.model.enseignant.Enseignant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sullivan on 17/12/2016.
 */
public class EnseignantServiceImpl implements EnseignantService  {
    List<Enseignant> enseignants = new ArrayList<Enseignant>();

    public void insertEnseignent(Enseignant enseignant) {
        enseignants.add(enseignant);
    }

    public List<Enseignant> getEnseignents() {
        return enseignants;
    }
}
