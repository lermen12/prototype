package com.prototype.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prototype.repositories.EntryRespository;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public Integer getTotal(){
        List<Entry> entries = new ArrayList<>();
        List<OutOfStock> outOfStocks= new ArrayList<>();
        int totalEntry = 0;
        int totalStocks = 0;
        for (Entry x : entries){
            totalEntry += x.getAmount();
        }
        for (OutOfStock y : outOfStocks){
            totalStocks += y.getAmount();
        }
        return totalEntry-totalStocks;
    }
}

