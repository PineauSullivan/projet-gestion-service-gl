package fr.nantes.gl.model.exemple;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

public interface StudentService {

	public void insertStudent(Student aStudent);

	public List<Student> getStudents();

}