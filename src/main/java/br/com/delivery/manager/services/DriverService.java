package br.com.delivery.manager.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.delivery.manager.dtos.DriverDto;
import br.com.delivery.manager.models.Driver;
import br.com.delivery.manager.repositories.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository driverRepository;
	
	
	public DriverDto save (Driver driver) {
		driverRepository.save(driver);
	return new DriverDto(driver);
	}

public DriverDto findById(Long id) {
		
		Driver driver = driverRepository.getOne(id);
		
		return new DriverDto(driver);
	}


	public List<DriverDto> findAll() {
		
		List<Driver> driverList = driverRepository.findAll();
		List<DriverDto>dtoList = new ArrayList<>();		
		for (Driver driver : driverList) {
			DriverDto driverDto = new DriverDto(driver);
			dtoList.add(driverDto);
		}
		return dtoList;
	}

}
