package com.voytovych.basic.start;

import com.voytovych.basic.objects.SonyHand;
import com.voytovych.basic.objects.SonyHead;
import com.voytovych.basic.objects.SonyLeg;

public class Robot {
	
	private SonyHand hand = new SonyHand();
	private SonyLeg leg = new SonyLeg();
	private SonyHead head = new SonyHead();
	
	public void action(){
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
