package com.voytovych.spring.abstracts.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.voytovych.spring.interfaces.Hand;
import com.voytovych.spring.interfaces.Head;
import com.voytovych.spring.interfaces.Leg;
import com.voytovych.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

	@Autowired
	@Qualifier("sonyHand")
	private Hand hand;

	@Autowired
	@Qualifier("sonyLeg")
	private Leg leg;

	@Autowired
	@Qualifier("sonyGoldenHead")
	private Head head;

	public BaseModel() {
		System.out.println(this + " - BaseModel constructor()");
	}

	// public BaseModel(Hand hand, Leg leg, Head head) {
	// this();
	// this.hand = hand;
	// this.leg = leg;
	// this.head = head;
	// }

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

}
