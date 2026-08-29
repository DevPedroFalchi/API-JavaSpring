package br.com.fiap.ex_semana3.service;


import br.com.fiap.ex_semana3.model.Produto;
import br.com.fiap.ex_semana3.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll(){
        return this.produtoRepository.findAll();
    }

    public Produto save(Produto produto){
        return this.produtoRepository.save(produto);
    }

}
