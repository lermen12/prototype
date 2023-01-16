package com.prototype.repositories;

import com.prototype.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRespository extends JpaRepository<Entry, Long> {

}
