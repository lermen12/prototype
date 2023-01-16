package com.prototype.repositories;

import com.prototype.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository <Product, Long>{

}
