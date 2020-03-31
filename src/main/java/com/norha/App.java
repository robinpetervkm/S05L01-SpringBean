package com.norha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.norha.cars.Corolla;
import com.norha.cars.Swift;
import com.norha.interfaces.Car;

public class App {

	 public static void main(String[] args) {

			/*
			 * Car swift = new Swift(); Car corolla = new Corolla();
			 * 
			 * System.out.println(swift.specs()); System.out.println(corolla.specs());
			 * 
			 * Car myCar = new Swift();
			 * 
			 * System.out.println("My Car:"+myCar.specs());
			 */
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("myCorolla",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
