package br.com.delivery.manager.dtos;

import br.com.delivery.manager.models.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriverDto {

	
	private Long  id;
	private String name;
	
	public DriverDto(Driver driver) {
		this.id = driver.getId();
		this.name = driver.getName();
	}
	
	
	
}
