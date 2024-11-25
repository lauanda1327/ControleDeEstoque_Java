package com.example.codigo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.codigo.model.MercadoriaModelo;

//interface com metodos para usar em outras classes
//(funções SQL) - findAll() e save(objeto)
//<Tipo da entidade, tipo do id>

@Repository
public interface MercadoriaRepository extends JpaRepository<MercadoriaModelo, Long>{
    //findAll()
    //save()

    //lista todos pelo nome
    public List<MercadoriaModelo> findAll(String nome);
    
    //pesquisa por id
    public MercadoriaModelo findById(Long id);

    //remove produto
    void deletar(MercadoriaModelo mercadoria);
    mercadoria.save();



}
