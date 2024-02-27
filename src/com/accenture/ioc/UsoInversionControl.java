package com.accenture.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoInversionControl {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Grupo grupo = (Grupo) context.getBean("grupo");
		System.out.println(grupo.toString());
	}

}
