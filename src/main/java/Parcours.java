import java.util.ArrayList;

/**
 * Created by Sébastien on 28/11/2016.
 */

@Entity
public class Parcours {
    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy="Module")
    private ArrayList<Module> listeDesModules;
    private Departement departement;

    public Parcours(Departement departement, Module module) {
        this.departement = departement;
        this.listeDesModules.add(module);
    }

    public Parcours(Departement departement, ArrayList<Module> modules){
        this.departement = departement;
        this.listeDesModules = modules;
    }

    public ArrayList<Module> getListeDesModules() {
        return listeDesModules;
    }

    public void setListeDesModules(ArrayList<Module> listeDesModules) {
        this.listeDesModules = listeDesModules;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public void addModule(Module module){
        this.listeDesModules.add(module);

    }

    public void removeModule(Module module){
        this.listeDesModules.remove(module);
    }
}
