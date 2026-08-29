/*
Controller — recebe as requisições HTTP

recebe a requisição;
pega os dados enviados pelo cliente;
chama o Service;
devolve uma resposta.


 */


package br.com.fiap.ex_semana3.controller;
import br.com.fiap.ex_semana3.dto.ProdutoResponse;
import br.com.fiap.ex_semana3.mapper.ProdutoMapper;
import br.com.fiap.ex_semana3.model.Produto;
import br.com.fiap.ex_semana3.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {

        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> findAll(){
        List<Produto> all = this.produtoService.findAll();
        return ResponseEntity.ok(ProdutoMapper.toResponse(all));
    }

}
