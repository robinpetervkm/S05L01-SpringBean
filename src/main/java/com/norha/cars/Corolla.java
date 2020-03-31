package com.norha.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.norha.interfaces.Car;
import com.norha.interfaces.Engine;

@Component("myCorolla")
public class Corolla implements Car {

	@Autowired 
	@Qualifier("V8Engine")
	Engine engine;
	

	public String specs() {

		String speString = "Sedan From Toyota With Engine Type as " + engine.type();
		return speString;
	}

}
