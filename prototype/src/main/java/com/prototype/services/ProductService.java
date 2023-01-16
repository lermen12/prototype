package com.prototype.services;

import com.prototype.entities.Entry;
import com.prototype.entities.Product;
import com.prototype.repositories.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRespository respository;

    public List<Product> fildAll(){
        return respository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = respository.findById(id);
        return obj.get();
    }

}
