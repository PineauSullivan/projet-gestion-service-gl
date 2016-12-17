package fr.nantes.gl.model.exemple;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerLauncher {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("server-beans.xml");
		System.out.println("Waiting for requests");
	}
}
