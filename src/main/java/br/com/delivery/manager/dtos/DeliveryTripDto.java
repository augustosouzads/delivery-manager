package br.com.delivery.manager.dtos;

import java.math.BigDecimal;
import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.delivery.manager.models.DeliveryTrip;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data //anotation lombok gets and setters
@AllArgsConstructor //tds construtores
public class DeliveryTripDto {
	
	
	@DateTimeFormat
	private Calendar dateTrip;
		
	private String region;
	private BigDecimal initialMileage;
	private BigDecimal finalMileage;
	private BigDecimal mileageTraveled;
	private BigDecimal fuelSupplyValue;
	private BigDecimal costOfFreight;

	public DeliveryTripDto(DeliveryTrip deliveryTrip) {
		this.dateTrip = deliveryTrip.getDateTrip();
		this.region = deliveryTrip.getRegion();
		this.initialMileage = deliveryTrip.getInitialMileage();
		this.finalMileage = deliveryTrip.getFinalMileage();
		this.fuelSupplyValue = deliveryTrip.getFuelSupplyValue();
		this.costOfFreight = deliveryTrip.getCostOfFreight();
	}
		
}
