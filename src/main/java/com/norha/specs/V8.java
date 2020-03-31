package com.norha.specs;

import org.springframework.stereotype.Component;

import com.norha.interfaces.Engine;
@Component("V8Engine")

public class V8 implements Engine {

	public String type() {
		return "V8 ENGINE"; 
	}

}
