package com.voytovych.spring.impls.toshiba;

import org.springframework.stereotype.Component;

import com.voytovych.spring.interfaces.Head;

@Component
public class ToshibaHead implements Head {

	public void calc() {
		System.out.println("Thinking about Toshiba...");
	}

}
