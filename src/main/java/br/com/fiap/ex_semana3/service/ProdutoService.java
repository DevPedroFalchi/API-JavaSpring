/*
Serivce = Regras de negocio
Fica entre o Controller e o Repository

Controller
    ↓
 Service
    ↓
Repository

Pense assim:
Service = cérebro da aplicação.

Ele decide o que deve acontecer.

 */


package br.com.fiap.ex_semana3.service;
import br.com.fiap.ex_semana3.model.Produto;
import br.com.fiap.ex_semana3.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
