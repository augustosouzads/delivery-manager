package br.com.delivery.manager.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.delivery.manager.models.DeliveryTrip;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data //anotation lombok gets and setters
@AllArgsConstructor //tds construtores
public class DeliveryTripDto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dateTrip;
		
	private String region;
	private BigDecimal initialMileage;
	private BigDecimal finalMileage;
	private BigDecimal mileageTraveled;
	private BigDecimal fuelSupplyValue;
	private BigDecimal costOfFreight;

	public DeliveryTripDto(DeliveryTrip deliveryTrip) {
		this.id = deliveryTrip.getId();
		this.dateTrip = deliveryTrip.getDateTrip();
		this.region = deliveryTrip.getRegion();
		this.initialMileage = deliveryTrip.getInitialMileage();
		this.finalMileage = deliveryTrip.getFinalMileage();
		this.fuelSupplyValue = deliveryTrip.getFuelSupplyValue();
		this.costOfFreight = deliveryTrip.getCostOfFreight();
	}
		
}
