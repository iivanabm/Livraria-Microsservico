package com.ms.service.impl;

import com.ms.exception.ProdutoNotFoundException;
import com.ms.model.Produto;
import com.ms.repository.ProdutoRepository;
import com.ms.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto create(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteById(long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public Produto update(long id, Produto produto) {
        produto.setId(id);
        return create(produto);
    }

    @Override
    public Produto getById(long id) {
        return produtoRepository.findById(id)
                .orElseThrow(ProdutoNotFoundException::new);
    }
}
