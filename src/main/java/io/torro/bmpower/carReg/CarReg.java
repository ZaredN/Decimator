package io.torro.bmpower.carReg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.torro.bmpower.BmPower;


@Entity //JPA creates a table with Topic instance of Topic.
public class CarReg{
	@Id //marks the primary key in the db
	private String carName;
	private String carModelName;
	private String carDescriptionCondition;
	private int vehicleYear;
	private String carProblemStatement;
	
	@ManyToOne // maps to the table via many to one ORM persistence
	private BmPower bmPower;
	
	public CarReg() {
		
	}
	public CarReg(String carName ,String carModelName, String carDescriptionCondition, int vehicleYear,String carProblemStatement) {
		super();
		this.carName = carName;
		this.carModelName = carModelName;
		this.carDescriptionCondition = carDescriptionCondition;
		this.vehicleYear = vehicleYear;
		this.carProblemStatement = carProblemStatement;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getCarDescriptionCondition() {
		return carDescriptionCondition;
	}
	public void setCarDescriptionCondition(String carDescriptionCondition) {
		this.carDescriptionCondition = carDescriptionCondition;
	}
	public int getVehicleYear() {
		return vehicleYear;
	}
	public void setVehicleYear(int vehicleYear) {
		this.vehicleYear = vehicleYear;
	}
	public String getCarProblemStatement() {
		return carProblemStatement;
	}
	public void setCarProblemStatement(String carProblemStatement) {
		this.carProblemStatement = carProblemStatement;
	}
	public BmPower getBmPower() {
		return bmPower;
	}
	public void setBmPower(BmPower bmPower) {
		this.bmPower = bmPower;
	}
	
	
}

