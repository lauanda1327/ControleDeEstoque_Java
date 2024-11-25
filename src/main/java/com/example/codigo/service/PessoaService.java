package com.example.codigo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.codigo.model.MercadoriaModelo;
import com.example.codigo.repository.LoginRepository;
//class service das mercadorias

@Service
@Transactional //se encontrar um problema ao fazer uma operação no
// banco de dados essa transação não será salva no banco(rollback)
public class LoginService {

    @autowired //passa o controle para o spring
    //importa os metódos do repository
    private final LoginRepository repository;


    public Opcional<Mercadoria> buscarPorId(Long id){
        //busca uma mercadoria especifica pelo id
        //retorna tudo o que encontrar sobre a mercadoria pelo id
        return repository.findById(id);
    }


}