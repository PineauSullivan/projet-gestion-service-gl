/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.nantes.spring.rmi;

import java.io.Serializable;

/**
 *
 * @author sunye
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7950662004399204703L;

	private String id;
	private String name;
	
	public Student(String anID, String aName) {
		id = anID;
		name = aName;
	}

	public String toString() {
		return "Name: " + name + " ID: "+ id;
	}

}