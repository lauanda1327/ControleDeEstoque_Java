package com.example.codigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codigo.model.Endereco;

public interface IEnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
