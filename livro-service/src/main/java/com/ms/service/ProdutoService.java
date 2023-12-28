package com.ms.service;

import com.ms.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    List<Produto> getAll();

    Produto create(Produto produto);

    void deleteById(long id);

    Produto update(long id, Produto produto);

    Produto getById(long id);
}
