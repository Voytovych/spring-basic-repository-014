package com.voytovych.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.voytovych.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		ModelT1000 t1000Empty = (ModelT1000) context.getBean("t1000Empty");

	}
}
