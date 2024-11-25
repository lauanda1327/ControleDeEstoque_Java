package com.example.codigo.model;//esse pacote
import jakarta.persistence.*;//importando o jakarta

//Aqui será criado o modelo de tabela do admin principal
@Entity
@Table(name = "admin")
public class PessoaModelo {
    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @collumn(name="id",nullable = false)
    private Long id;
    @collumn(name="nome", unique = true,nullable = false, length = 80)
    private String nome = "nome";
    @collumn(name="senha",, unique = true, length = 20,nullable = false)
    private String senha = "senha";
    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;
    @Column(name = "hora_entrada", nullable = false, columnDefinition = "HORA")
    private LocalTime horaEntrada;//depois verificar se é isso mesmo 

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDate getDataEntradaAoSistema() {
        return dataEntrada;
    }
    public void setDataEntradaAoSistema(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public LocalDate getHoraEntradaAoSistema() {
        return horaEntrada;
    }
    public void setHoraEntradaAoSistema(LocalDate horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}
