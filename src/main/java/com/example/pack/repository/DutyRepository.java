package com.example.pack.repository;


import com.example.pack.model.Duty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DutyRepository extends JpaRepository<Duty, Long> {


}
