package com.example.codigo.model;//esse pacote
import jakarta.persistence.*;//importando o jakarta


//Aqui será criado o modelo de tabela das mercadorias
@Entity
@Table(name = "mercadorias")
public class MercadoriaModelo {

    @ID
    //criando as colunas da tabela
    //identificando como um id unico e incremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @collumn(name="id",nullable = false)
    private Long id;

    @collumn(name="nome",nullable = false, unique = true, length = 80)//nome
    private String nome;
    @collumn(name="tipo",nullable = false, unique = true, length = 30)//tipo
    private String tipo;
    @collumn(name="marca", length = 40)//marca
    private String marca;
    @collumn(name="precoDeCusto",nullable = false)//preco de atacado
    private float precoDeCusto;
    @collumn(name="precoDeRevenda",nullable = false)//preco de varejo
    private float precoDeRevenda;
    @collumn(name="quantidade",nullable = false)//quantidade
    private int quantidade;
    @collumn(name="posicaoNoEstoqueX")//posicao x
    private int posicaoNoEstoqueX;
    @collumn(name="posicaoNoEstoqueY")//posicao y
    private int posicaoNoEstoqueY;
    @collumn(name="posicaoNoEstoqueZ")//posicao z
    private int posicaoNoEstoqueZ;
    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

			

   //retorna id
    public int getId() {
        return id;
    }
    //seta id
    public void setId(int id) {
        this.id = id;
    }
    //retorna name
    public String getNome() {
        return nome;
    }
    //seta o nome do usuario
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getPrecoDeCusto() {
        return precoDeCusto;
    }
    public void setPrecoDeCusto(float precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }
    public float getPrecoDeRevenda() {
        return precoDeRevenda;
    }
    public void setPrecoDeRevenda(float precoDeRevenda) {
        this.precoDeRevenda = precoDeRevenda;
    }
    public float getLucroPorUnidade(){
        return this.precoDeRevenda - this.precoDeCusto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getPosicaoNoEstoqueX() {
        return posicaoNoEstoqueX;
    }
    public void setPosicaoNoEstoqueX(int posicaoNoEstoqueX) {
        this.posicaoNoEstoqueX = posicaoNoEstoqueX;
    }
    public int getPosicaoNoEstoqueY() {
        return posicaoNoEstoqueY;
    }
    public void setPosicaoNoEstoqueY(int posicaoNoEstoqueY) {
        this.posicaoNoEstoqueY = posicaoNoEstoqueY;
    }
    public int getPosicaoNoEstoqueZ() {
        return posicaoNoEstoqueZ;
    }
    public void setPosicaoNoEstoqueZ(int posicaoNoEstoqueZ) {
        this.posicaoNoEstoqueZ = posicaoNoEstoqueZ;
    }
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}