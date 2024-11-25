package com.example.codigo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//realizando as importacoes dos arquivo do model e repository
import com.example.codigo.model.MercadoriaModelo;
import com.example.codigo.model.LoginModelo;
import com.example.codigo.model.Endereco;
import com.example.codigo.model.PessoaModelo;
import com.example.codigo.model.UF;
import com.example.codigo.repository.ModeloRepository;
import com.example.codigo.repository.LoginRepository;
import com.example.codigo.repository.PessoaRepository;
// comentado aqui em baixo
// import com.example.codigo.repository.IEnderecoRepository;

@SpringBootApplication
public class gerenciadorDeEstoque {

//metodo principal do sistema
	public static void main(String[] args){
		// Codigo principal que executa todas as funcionalidades do software
		System.out.println("Chamando o software");
		SpringApplication.run(gerenciadorDeEstoque.class, args);

	}

	//permite a saída pelo console
	@Bean
	//...................... demo(Departamentos dep) {
	public CommandLineRunner demo(
	MercadoriaRepository mercadoriaRepository,
	PessoaRepository pessoaRepository,
	LoginRepository loginRepository) {

		return (args) -> {


			MercadoriaModelo m = new MercadoriaModelo();
			m.setNome("martelo");
			m.setTipo("material de construcao");
			m.setMarca("lg");
			m.setPrecoDeCusto(15.99)
			m.setPrecoDeRevenda(18.90)

			m.setQuantidade(2)
			m.setPosicaoNoEstoqueX(2)
			m.setPosicaoNoEstoqueY(3)
			m.setPosicaoNoEstoqueZ(1)
			m.setDataEntrada("20-12-2024")
			mercadoriaRepository.save(m);


			PessoaModelo p = new PessoaModelo();

			p.setNome("Felipino De Souza Rodrigues");
			p.setSenha("carro9090")
			// p.setDataEntradaAoSistema("20-12-2024") -> tem que ser automatico
			// p.setDataEntradaAoSistema("16:40:90") -> tem que ser automatico
			PessoaRepository.save(p);

			Endereco e = new Endereco();
			e.setLogradouro("Rua Deodoro da Fonseca");
			e.setNumero(10);
			e.setBairro("Centro");
			e.setCep("46165000");
			e.setComplemento("casa");
			e.setCidade("Brumado");
			e.setUf(UF.BA);

			// Pessoa p = new Pessoa();
			// p.setNome("Raissao De Carvalho");
			// p.setDataEntrada(LocalDate.now());
			// p.setSalario(new BigDecimal("1000.00"));
			// p.setEndereco(e);
			// PessoaRepository.save(p);

			System.out.println(mercadoriaRepository.findAll());
			System.out.println(pessoaRepository.findAll());
			// System.out.println(loginRepository.findAll());
			System.out.println(e.getEndereco().getLogradouro());
			System.out.println(m.getNome().getLucroPorUnidade());


		};
	}
}
