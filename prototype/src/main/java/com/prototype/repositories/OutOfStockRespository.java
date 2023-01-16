package com.prototype.repositories;

import com.prototype.entities.OutOfStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutOfStockRespository extends JpaRepository<OutOfStock, Long> {

}
