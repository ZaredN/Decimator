package io.torro.bmpower.carReg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.torro.bmpower.BmPower;
//Session factory is an interface which helps to create an instance of a session.
@RestController
public class CarRegController {
	//set the return type of the method to what the response should be
			//springmvc converts the arrayList calls into a json request
	@Autowired // needs dependency injection, create a new instance and looks at registry and takes instance and injects it through
	private CarRegService carRegService;
	//Persistence, in computer science, is a noun describing data that outlives the process that created it.
	
	@RequestMapping("/bmPower/{carOwnerNames}/carReg") //GET request to get all topics	
	public List <CarReg> getAllCars(@PathVariable String carOwnerName) { 
		return carRegService.getAllCars(carOwnerName); //encapsulated method call to access topics from Business Service
					
	}
	@RequestMapping("/bmPower/{carName}/carReg/{carOwnerNames}") // Tells spring this is a variable portion
	 public Optional<CarReg> getCar(@PathVariable String carName) {// GET request for a single topic -course id // tells spring that this is a variable id
		return carRegService.getCars(carName);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/bmwpower/{carName}/carReg")
	public void addCarReg(@RequestBody CarReg carReg, @PathVariable String carName) {
		carReg.setBmPower(new BmPower(carName, 0, "", 0));
		carRegService.addCar(carReg);
	}
	//I have used postMan to check each method call
	@RequestMapping(method=RequestMethod.PUT, value="/bmPower/{carName}/carReg/{carOwnerNames}")
	public void updateCourse(@RequestBody CarReg carReg, @PathVariable String carName, @PathVariable String id) {
		carReg.setBmPower(new BmPower(carName, 0, "", 0));
		carRegService.updateCar(carReg);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/bmPower/{carName}/carReg/{carOwnerNames}") //go to a specific page and delete the list.
	public void deleteTopic(@PathVariable String carOwnerNames) {
		carRegService.deleteCar(carOwnerNames);
	}
}
