package com.prototype.resources;

import com.prototype.entities.Entry;
import com.prototype.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/entries")
public class EntryResource {
    @Autowired
    private EntryService service;

    @GetMapping
    public ResponseEntity<List<Entry>> findAll(){
        List<Entry> list = service.fildAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping (value ="/{id}")
    public ResponseEntity<Entry> findById(@PathVariable Long id){
        Entry obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping
    public ResponseEntity<Entry> insert(@RequestBody Entry entry){
        entry = service.insert(entry);
        return ResponseEntity.ok().body(entry);
    }
}
