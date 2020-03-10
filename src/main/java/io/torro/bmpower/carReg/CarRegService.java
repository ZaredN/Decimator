package io.torro.bmpower.carReg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // A stereotype annotation (class-path scan/ singleton )
public class CarRegService {
	@Autowired // allows a member variable to have access to service class, injects an instance
				// to spring Framework
	private CarRegRepository carRegRepository;

	public List<CarReg> getAllCars(String carName) { // method which returns list of topics. //return topics;
		List<CarReg> carList = new ArrayList<>();
		carRegRepository.findByCarName(carName).forEach(carList::add);// lambda expression Method reference get the
																		// course
																		// and add it to the courses list
		return carList;
	}

	public Optional<CarReg> getCars(String id) {
		return carRegRepository.findById(id);
	}

	public void addCar(CarReg carReg) {
		carRegRepository.save(carReg);

	}

	public void updateCar(CarReg carReg) {
		carRegRepository.save(carReg); // the save method in the CRUD repository can do both Add and Update, checks if
										// the row exists, if row exists it updates if not it inserts a row.

	}

	public void deleteCar(String id) {
		carRegRepository.deleteById(id);

	}

}
