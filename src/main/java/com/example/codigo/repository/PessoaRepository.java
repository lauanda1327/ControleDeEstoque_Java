package com.example.codigo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.codigo.model.PessoaModelo;


public interface PessoaRepository extends JpaRepository<PessoaModelo, Long>{


}
