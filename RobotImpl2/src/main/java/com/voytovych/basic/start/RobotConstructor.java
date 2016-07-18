package com.voytovych.basic.start;

import com.voytovych.basic.impls.sony.SonyHand;
import com.voytovych.basic.impls.sony.SonyHead;
import com.voytovych.basic.impls.toshiba.ToshibaLeg;


public class RobotConstructor {
	
	public static void main(String[] args){
		
		SonyHand sonyHand = new SonyHand();		
		ToshibaLeg toshibaLeg = new ToshibaLeg();		
		SonyHead sonyHead = new SonyHead();
		
		Robot robot = new Robot(sonyHand, toshibaLeg, sonyHead);
		
		robot.action();
		
		
	}

}
