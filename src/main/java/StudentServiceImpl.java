/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.nantes.spring.rmi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunye
 */
public class StudentServiceImpl implements StudentService {

	List<Student> students = new ArrayList<Student>();

	public void insertStudent(Student acc) {
		students.add(acc);
	}

	public List<Student> getStudents() {
		return students;
	}

}