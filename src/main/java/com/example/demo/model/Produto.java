package com.example.demo.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer quantidade;

    public Produto() {}

    public long getId() { return id; }

    public String getNome() {return nome; }
    public void setNome(String nome) {this.nome = nome;}

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @ManyToOne
    private Categoria categoria;






}
