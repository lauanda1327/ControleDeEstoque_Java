package com.example.codigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codigo.model.Cargo;


public interface ICargoRepository extends JpaRepository<Cargo, Long>{
    
}
