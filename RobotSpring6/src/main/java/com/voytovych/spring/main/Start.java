package com.voytovych.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.voytovych.spring.interfaces.Robot;
import com.voytovych.spring.interfaces.RobotConveyor;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		// ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		// BaseModel baseModel = (BaseModel) context.getBean("baseModel");

		RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

		Robot terminator1 = t1000Conveyor.createRobot();
		Robot terminator2 = t1000Conveyor.createRobot();
		Robot terminator3 = t1000Conveyor.createRobot();

		System.out.println("terminator1 " + terminator1);
		System.out.println("terminator2 " + terminator2);
		System.out.println("terminator3 " + terminator3);

	}
}
