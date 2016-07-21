package com.voytovych.spring.impls.toshiba;

import org.springframework.stereotype.Component;

import com.voytovych.spring.interfaces.Leg;

@Component
public class ToshibaLeg implements Leg {

	public void go() {
		System.out.println("Go to Toshiba!");
	}

}
