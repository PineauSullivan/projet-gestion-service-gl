/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.nantes.spring.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sunye
 */
public class ServerLauncher {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("server-beans.xml");
		System.out.println("Waiting for requests");
	}
}
