package io.torro.bmpower;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // JPA creates a table with Topic instance of Topic.
public class BmPower {
	@Id // marks the primary key in the db
	private String carOwnerName;
	private int carOwnerContactNr;
	private String carOwnerEmailAddress;
	private int vehicleProblemDescription;

	public BmPower() {

	}

	public BmPower(String carOwnerName, int carOwnerContactNr, String carOwnerEmailAddress, int vehicleProblemDescription ){
		super();
		this.carOwnerName = carOwnerName;
		this.carOwnerContactNr = carOwnerContactNr;
		this.carOwnerEmailAddress = carOwnerEmailAddress;
		this.vehicleProblemDescription = vehicleProblemDescription;
	}

	public String getCarOwnerName() {
		return carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public int getCarOwnerContactNr() {
		return carOwnerContactNr;
	}

	public void setCarOwnerContactNr(int carOwnerContactNr) {
		this.carOwnerContactNr = carOwnerContactNr;
	}

	public String getCarOwnerEmailAddress() {
		return carOwnerEmailAddress;
	}

	public void setCarOwnerEmailAddress(String carOwnerEmailAddress) {
		this.carOwnerEmailAddress = carOwnerEmailAddress;
	}

	public int getVehicleProblemDescription() {
		return vehicleProblemDescription;
	}

	public void setVehicleProblemDescription(int vehicleProblemDescription) {
		this.vehicleProblemDescription = vehicleProblemDescription;
	}

	

}
