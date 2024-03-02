package com.accenture.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase donde se crea el contexto de Spring a partir del
 * fichero applicationContext.xml
 * 
 * @author Andrea Ravagli Castillo
 */
public class UsoInversionControl {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Grupo grupo = (Grupo) context.getBean("grupo");
		System.out.println(grupo.toString());
	}

}
