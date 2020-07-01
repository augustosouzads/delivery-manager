package br.com.delivery.manager.dtos;

import java.util.List;

import br.com.delivery.manager.models.DeliveryTrip;
import br.com.delivery.manager.models.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriverDto {

	
	private Long  id;
	private String name;
	private List<DeliveryTrip> deliveryTrips;
	
	public DriverDto(Driver driver) {
		this.id = driver.getId();
		this.name = driver.getName();
		this.deliveryTrips = driver.getDeliveryTrip();
	}
	
	
	
}
