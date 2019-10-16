package com.example.demo;

import lombok.*;
import lombok.experimental.NonFinal;

@ Value public class LombokBank {

	@Getter(lazy=true) private final double CEOSalary = salaryCalculator();
	String name;
	String address;
	@With String phoneNumber;
	@NonFinal double assetts;
	
	
	private double salaryCalculator() {
		double result;
		result = this.assetts * 100;
		
		return result;
	}
	
}
