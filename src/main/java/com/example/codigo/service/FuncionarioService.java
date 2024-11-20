package com.example.codigo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.codigo.model.Funcionario;
import com.example.codigo.repository.IFuncionarioRepository;

@Service
@Transactional
public class FuncionarioService{
    @Autowired
    private IFuncionarioRepository repository;

    public void salvar(Funcionario funcionario){
        repository.save(funcionario);
    }

    public void editar(Funcionario funcionario){
        repository.save(funcionario);        
    }

    public void excluir(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Funcionario> buscarTodas(){
        return repository.findAll();
    }
    
}
