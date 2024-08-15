package com.java.estoque.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class ProdutoFornecedorId {

    @Column(name = "produto_id")
    private UUID produtoId;

    @Column(name = "fornecedor_id")
    private UUID fornecedorId;

}
