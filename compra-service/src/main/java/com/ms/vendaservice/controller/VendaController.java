package com.ms.vendaservice.controller;

import com.ms.vendaservice.model.Produto;
import com.ms.vendaservice.payload.VendaPayload;
import com.ms.vendaservice.service.ProdutoApiService;
import com.ms.vendaservice.service.ProdutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class VendaController {

    @Autowired
    ProdutoService produtoService;

    Logger logger = LoggerFactory.getLogger(VendaController.class);

    @PostMapping
    public void registraVenda(VendaPayload vendaPayload) {
        logger.info("Registra venda de: " + vendaPayload);
        logger.info("Buscando Produtos: " + vendaPayload.getProdutos());
        List<Produto> todos = produtoService.getAllProdutos(vendaPayload.getProdutos());
        logger.info("Produtos: " + todos);
    }
}
