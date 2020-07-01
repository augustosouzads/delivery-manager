package br.com.delivery.manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.delivery.manager.models.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{
	

}
