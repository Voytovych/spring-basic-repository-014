package com.voytovych.spring.impls.toshiba;

import com.voytovych.spring.interfaces.Hand;

public class ToshibaHand implements Hand{
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
