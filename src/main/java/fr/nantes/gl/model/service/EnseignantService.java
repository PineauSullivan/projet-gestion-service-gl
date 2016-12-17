package fr.nantes.gl.model.service;


import fr.nantes.gl.model.enseignant.Enseignant;

import java.util.List;

/**
 * Created by Sullivan on 17/12/2016.
 */
public interface EnseignantService {

    public void insertEnseignent(Enseignant enseignant);

    public List<Enseignant> getEnseignents();
}
