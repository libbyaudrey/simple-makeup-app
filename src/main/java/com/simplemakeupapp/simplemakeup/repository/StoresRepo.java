package com.simplemakeupapp.simplemakeup.repository;

import com.simplemakeupapp.simplemakeup.entity.Stores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoresRepo extends JpaRepository<Stores, Long> {

}
