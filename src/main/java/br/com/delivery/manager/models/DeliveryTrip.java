package br.com.delivery.manager.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //anotation lombok gets and setters
@AllArgsConstructor //tds construtores
@NoArgsConstructor
public class DeliveryTrip {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateTrip;
		
	private String region;
	private BigDecimal initialMileage;
	private BigDecimal finalMileage;
	private BigDecimal mileageTraveled;
	private BigDecimal fuelSupplyValue;
	private BigDecimal costOfFreight;
		
}
