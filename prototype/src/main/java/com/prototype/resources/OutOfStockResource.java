package com.prototype.resources;

import com.prototype.entities.OutOfStock;
import com.prototype.services.OutOfStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/stocks")
public class OutOfStockResource {

  @Autowired
  private OutOfStockService service;

  @GetMapping
  public ResponseEntity<List<OutOfStock>> findAll() {
    List<OutOfStock> list = service.fildAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<OutOfStock> findById(@PathVariable Long id) {
    OutOfStock obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }
}
