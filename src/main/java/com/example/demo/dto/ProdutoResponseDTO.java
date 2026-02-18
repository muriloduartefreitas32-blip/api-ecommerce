package com.example.demo.dto;
import java.math.BigDecimal;

public class ProdutoResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer quantidade;

    public ProdutoResponseDTO(Long id, String nome, String descricao, BigDecimal preco, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    // getters
}
