package com.ms.vendaservice.service;

import com.ms.vendaservice.model.Produto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "livro-service", url = "http://localhost:9090/api/produto")
public interface ProdutoApiService {

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Produto getById(@PathVariable Long id);
}
