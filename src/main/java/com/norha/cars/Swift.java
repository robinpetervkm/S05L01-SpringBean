package com.norha.cars;
import org.springframework.stereotype.Component;
import com.norha.interfaces.Car;

@Component
public class Swift implements Car {

	public String specs() {
		
		return "Hatchback from Suzuki";
	}

}
