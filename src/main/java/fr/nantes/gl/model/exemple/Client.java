package fr.nantes.gl.model.exemple;

import java.util.List;

import fr.nantes.gl.model.departement.Departement;
import fr.nantes.gl.model.enseignant.Contrat;
import fr.nantes.gl.model.enseignant.Enseignant;
import fr.nantes.gl.model.service.EnseignantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");


		/*StudentService as = (StudentService) context.getBean("studentBean");

		Student a = new Student("A", "Alice");
		as.insertStudent(a);

		Student b = new Student("B", "Bob");
		as.insertStudent(b);

		List<Student> accounts = as.getStudents();
		for (Student each : accounts) {
			System.out.println(each);
		}*/

		EnseignantService es = (EnseignantService) context.getBean("enseignantBean");

		Departement departementInfo = new Departement("informatique");
		Contrat contrat = new Contrat(10,15);
		Enseignant a = new Enseignant(departementInfo,"MonNom2", "MonPrenom2", "Prof", contrat);
		Enseignant b = new Enseignant(departementInfo,"MonNom3", "MonPrenom3", "Prof", contrat);

		es.insertEnseignent(a);
		es.insertEnseignent(b);


		List<Enseignant> accounts = es.getEnseignents();
		for (Enseignant each : accounts) {
			System.out.println(each.get_prenom());
		}

	}
}
