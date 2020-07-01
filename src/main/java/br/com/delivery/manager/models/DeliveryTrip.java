package br.com.delivery.manager.models;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data //anotation lombok gets and setters
@AllArgsConstructor //tds construtores
@NoArgsConstructor
public class DeliveryTrip {
	
	@DateTimeFormat
	private Calendar dateTrip;
		
	private String region;
	private BigDecimal initialMileage;
	private BigDecimal finalMileage;
	private BigDecimal mileageTraveled;
	private BigDecimal fuelSupplyValue;
	private BigDecimal costOfFreight;
		
}
