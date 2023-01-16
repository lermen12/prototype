package com.prototype.services;

import com.prototype.entities.Entry;
import com.prototype.repositories.EntryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryService {
    @Autowired
    private EntryRespository respository;

    public List<Entry> fildAll(){
        return respository.findAll();
    }

    public Entry findById(Long id){
        Optional<Entry> obj = respository.findById(id);
        return obj.get();
    }
    public Entry insert(Entry entry){
        return respository.save(entry);
    }


}
