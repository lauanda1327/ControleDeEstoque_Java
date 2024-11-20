package com.example.codigo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.codigo.model.Cargo;
import com.example.codigo.model.Departamento;
import com.example.codigo.model.Endereco;
import com.example.codigo.model.Funcionario;
import com.example.codigo.model.UF;
import com.example.codigo.repository.ICargoRepository;
import com.example.codigo.repository.IDepartamentoRepository;
import com.example.codigo.repository.IFuncionarioRepository;
// comentado aqui em baixo
// import com.example.codigo.repository.IEnderecoRepository;

@SpringBootApplication
public class gerenciadorDeEstoque {

	public static void main(String[] args) {//metodo principal do sistema
		// Codigo principal que executa todas as funcionalidades do software
		System.out.println("Chamando o software");
		SpringApplication.run(gerenciadorDeEstoque.class, args);

	}

	//abilita Saída para o console
	@Bean
	//                       demo(Departamentos dep) {
	public CommandLineRunner demo(
	ICargoRepository cargoRepository, 
	IDepartamentoRepository departamentoRepository,
	IFuncionarioRepository funcionarioRepository) {

		return (args) -> {

			
			Departamento d = new Departamento();
			d.setNome("TESTE");
			departamentoRepository.save(d);

			Cargo c = new Cargo();
			
			c.setNome("Felipino De Souza Rodrigues");
			c.setDepartamento(d);
			cargoRepository.save(c);

			Endereco e = new Endereco();
			e.setLogradouro("Rua Deodoro da Fonseca");
			e.setNumero(10);
			e.setBairro("Centro");
			e.setCep("46165000");
			e.setComplemento("casa");
			e.setCidade("Dom Basilio");
			e.setUf(UF.BA);

			Funcionario f = new Funcionario();
			f.setNome("Raissao De Carvalho");
			f.setDataEntrada(LocalDate.now());
			f.setSalario(new BigDecimal("1000.00"));
			f.setEndereco(e);
			funcionarioRepository.save(f);

			System.out.println(departamentoRepository.findAll());
			System.out.println(cargoRepository.findAll());
			System.out.println(funcionarioRepository.findAll());
			System.out.println(f.getEndereco().getLogradouro());
			
			
		};
	}
}
