package com.example.codigo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.codigo.model.Cargo;
import com.example.codigo.repository.ICargoRepository;



@Service
@Transactional(readOnly = false)
public class CargoService {
    @Autowired
    private ICargoRepository repository;

    public void salvar(Cargo cargo){
        repository.save(cargo);
    }

    public void editar(Cargo cargo){
        repository.save(cargo);        
    }

    public void excluir(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Cargo buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Cargo> buscarTodas(){
        return repository.findAll();
    }
    
}
