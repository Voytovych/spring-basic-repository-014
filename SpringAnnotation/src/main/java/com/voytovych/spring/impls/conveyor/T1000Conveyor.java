package com.voytovych.spring.impls.conveyor;

import com.voytovych.spring.interfaces.Robot;
import com.voytovych.spring.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {

	@Override
	public abstract Robot createRobot();

}
