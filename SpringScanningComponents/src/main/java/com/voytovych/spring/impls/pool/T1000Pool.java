package com.voytovych.spring.impls.pool;

import org.springframework.beans.factory.annotation.Autowired;

import com.voytovych.spring.enums.ColorStyle;
import com.voytovych.spring.interfaces.Robot;
import com.voytovych.spring.qualifiers.RobotType;

public class T1000Pool {

	public T1000Pool() {
		System.out.println("t1000 pool constructor()");
	}

	@Autowired
	@RobotType(sound = false, color = ColorStyle.BLACK)
	private Robot blackRobot;

	@Autowired
	@RobotType(sound = true, color = ColorStyle.BLACK)
	private Robot blackSoundableRobot;

	public Robot getBlackRobot() {
		return blackRobot;
	}

	public Robot getBlackSoundableRobot() {
		return blackSoundableRobot;
	}

}
