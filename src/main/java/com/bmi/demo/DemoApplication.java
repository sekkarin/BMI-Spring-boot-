package com.bmi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	private CalBMIHuman calBMIHuman;
	private AnayzelBMI anayzelBMI;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/calbmi")
	public BmiInfo calbmi(@RequestBody BodyDataBmi bmi) {
		float height = bmi.getHeight();
    	float weight= bmi.getWeight();
		this.anayzelBMI = new AnayzelBMI();
		this.calBMIHuman = new CalBMIHuman();
		String anayzelBMI = this.anayzelBMI.anayzel(height, weight);
		float mybmi = this.calBMIHuman.calBmi(height, weight);
		return new BmiInfo(mybmi,anayzelBMI);
	}
}
