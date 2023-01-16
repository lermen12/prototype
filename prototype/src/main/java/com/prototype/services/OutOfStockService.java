package com.prototype.services;

import com.prototype.entities.OutOfStock;
import com.prototype.repositories.OutOfStockRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OutOfStockService {

  @Autowired
  private OutOfStockRespository respository;

  public List<OutOfStock> fildAll() {
    return respository.findAll();
  }

  public OutOfStock findById(Long id) {
    Optional<OutOfStock> obj = respository.findById(id);
    return obj.get();
  }

}
