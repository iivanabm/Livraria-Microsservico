package com.ms.vendaservice.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Produto {
    private Long id;

    private String nome;

    private BigDecimal valor;
}
