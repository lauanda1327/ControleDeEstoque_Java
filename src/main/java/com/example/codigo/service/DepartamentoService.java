package com.example.codigo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.codigo.model.Departamento;
import com.example.codigo.repository.IDepartamentoRepository;

@Service
@Transactional
public class DepartamentoService {
   @Autowired
    private IDepartamentoRepository repository;

    public void salvar(Departamento departamento){
        repository.save(departamento);
    }

    public void editar(Departamento departamento){
        repository.save(departamento);        
    }

    public void excluir(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Departamento> buscarTodas(){
        return repository.findAll();
    }
    
}
 
