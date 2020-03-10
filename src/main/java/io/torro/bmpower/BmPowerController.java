package io.torro.bmpower;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmPowerController {
	//set the return type of the method to what the response should be
			//springmvc converts the arrayList calls into a json request
	@Autowired // needs dependency injection, create a new instance and looks at registery and takes instance and injects it through
	private BmPowerService bmPowerService;
	
	@RequestMapping("/bmPowerLanding") //GET request to get all topics	
	public List <BmPower> getAllCustomers() { 
		return bmPowerService.getAllCustomers(); //encapsulated method call to access topics from Business Service
					
				
	}
	@RequestMapping("/bmPowerLanding/{carOwnerName}") // Tells spring this is a variable portion
	 public Optional<BmPower> getCustomer(@PathVariable String carOwnerName) {// GET request for a single topic // tells spring that this is a variable id
		return bmPowerService.getCustomer(carOwnerName);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/bmPowerLanding")
	public void addCustomer(@RequestBody BmPower bmPower) {
		bmPowerService.addCustomer(bmPower);
	}
	//I have used postMan to check each method call
	@RequestMapping(method=RequestMethod.PUT, value="/bmPowerLanding/{carOwnerName}")
	public void updateCustomer(@RequestBody BmPower bmPower, @PathVariable String carOwnerName) {
		bmPowerService.updateCustomer(carOwnerName, bmPower);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/bmPowerLanding/{carOwnerName}") //go to a specific page and delete the list.
	public void deleteCustomer(@PathVariable String carOwnerName) {
		bmPowerService.deleteCustomer(carOwnerName);
		
	}
	@RequestMapping(method=RequestMethod.PUT, value="/bmPowerLanding/{id}")
	public void hoursToBeWorked() {
		System.out.println();
		
	}
}
