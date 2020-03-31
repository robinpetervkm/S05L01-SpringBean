package com.norha.specs;

import org.springframework.stereotype.Component;

import com.norha.interfaces.Engine;
@Component("V6Engine")

public class V6 implements Engine {

	public String type() {
		return "V6 ENGINE";
	}

	

}
 