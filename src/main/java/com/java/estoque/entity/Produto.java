package com.java.estoque.entity;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "produto_id")
    private UUID produtoId;

    @Column(name = "produto_nome")
    private String produtoNome;

    @Column(name = "produto_marca")
    private String produtoMarca;

    @Column(name = "preco")
    private BigDecimal produtoPreco;

    @Column(name = "quantidade")
    private Long quantidade;

    @Column(name = "produto_codigo")
    private String produtoCodigo;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updated_at;

}
