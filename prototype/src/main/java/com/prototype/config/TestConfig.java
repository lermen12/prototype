package com.prototype.config;

import com.prototype.entities.Entry;
import com.prototype.entities.OutOfStock;
import com.prototype.entities.Product;
import com.prototype.repositories.EntryRespository;
import com.prototype.repositories.OutOfStockRespository;
import com.prototype.repositories.ProductRespository;
import com.prototype.services.EntryService;
import com.prototype.services.OutOfStockService;
import com.prototype.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private OutOfStockRespository outOfStockRespository;

  @Autowired
  private EntryRespository entryRespository;

  @Autowired
  private ProductRespository productRespository;


  @Override
  public void run(String... args) {

    Product product1 = new Product(null, "Notbook");
    Product product2 = new Product(null, "Computador");
    Entry entry1 = new Entry(null, new Date(), 10, product1);
    Entry entry2 = new Entry(null, new Date(), 10, product2);
    OutOfStock stock = new OutOfStock(null, new Date(), 9, product1);

    productRespository.saveAll(Arrays.asList(product1, product2));
    entryRespository.saveAll(Arrays.asList(entry1, entry2));
    outOfStockRespository.save(stock);

//       entryRespository.findAll().forEach(x ->
//                System.out.println(x.getAmount().intValue())
//        );

  }
}
