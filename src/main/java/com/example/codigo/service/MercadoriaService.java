package com.example.codigo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.codigo.model.MercadoriaModelo;
import com.example.codigo.repository.MercadoriaRepository;
//class service das mercadorias

@Service
@Transactional //se encontrar um problema ao fazer uma operação no
// banco de dados essa transação não será salva no banco(rollback)
public class MercadoriaService {

    @autowired //passa o controle para o spring
    //importa os metódos do repository
    private final MercadoriaRepository repository;


    public void salvar(Mercadoria mercadoria){
        //salva uma mercadoria nova
        return repository.save(mercadoria);
    }
    public List<Mercadoria>listartodos(){
        //mostra todas as mercadoris do estoque
        return repository.findAll();
    }
    public Opcional<Mercadoria> buscarPorId(Long id){
        //busca uma mercadoria especifica pelo id
        //retorna tudo o que encontrar sobre a mercadoria pelo id
        return repository.findById(id);
    }
    public Opcional<Mercadoria> buscarPorNome(String nome){
        //busca uma mercadoria especifica pelo nome dela
        //retorna tudo o que encontrar sobre a mercadoria pelo nome
        return repository.findByName(id);
    }
    public void editar(Mercadoria mercadoria){
        //edita informações da mercadoria
        return repository.save(mercadoria);
    }
    public void deletar(Long id){
        //exclui a mercadoria pelo id
        repository.deleteById(id);
    }



}