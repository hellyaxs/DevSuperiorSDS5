package com.devsuperior.sdvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.sdvendas.dto.SaleSucessDTO;
import com.devsuperior.sdvendas.dto.SaleSumDTO;
import com.devsuperior.sdvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {

	
	@Query("SELECT new com.devsuperior.sdvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"+
	" FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.sdvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals))"+
			" FROM Sale AS obj GROUP BY obj.seller")
			List<SaleSucessDTO> SucessGroupedBySeller();
}
