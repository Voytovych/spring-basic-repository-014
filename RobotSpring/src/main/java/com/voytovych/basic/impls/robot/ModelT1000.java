package com.voytovych.basic.impls.robot;

import com.voytovych.basic.interfaces.Hand;
import com.voytovych.basic.interfaces.Head;
import com.voytovych.basic.interfaces.Leg;
import com.voytovych.basic.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	@Override
	public void fire() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
