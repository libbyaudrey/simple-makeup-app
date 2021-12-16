package com.simplemakeupapp.simplemakeup.repository;

import com.simplemakeupapp.simplemakeup.entity.Makeup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeupRepo extends JpaRepository<Makeup, Long> {
}
