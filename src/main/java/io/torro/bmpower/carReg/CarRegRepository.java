package io.torro.bmpower.carReg;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRegRepository extends CrudRepository<CarReg, String> {

	public List<CarReg> findByCarName(String carName);
	
}
	