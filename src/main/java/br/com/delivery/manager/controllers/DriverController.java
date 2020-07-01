package br.com.delivery.manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.delivery.manager.dtos.DriverDto;
import br.com.delivery.manager.models.Driver;
import br.com.delivery.manager.services.DriverService;



@RestController
@RequestMapping("/")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	
	@PostMapping
	public DriverDto save(@RequestBody Driver  driver)	{
	return 	driverService.save(driver);
	
	}
		
	@GetMapping("/{id}")
	public DriverDto findById(@PathVariable Long id) {
		
		DriverDto driverDto = driverService.findById(id);
		
		return driverDto;
	}
	
	@GetMapping
	public List<DriverDto> findAll() {
		List<DriverDto> list = driverService.findAll();
		
		return list;
	}
	
	 
	
}
