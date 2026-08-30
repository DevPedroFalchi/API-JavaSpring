/*
Controller — recebe as requisições HTTP

recebe a requisição;
pega os dados enviados pelo cliente;
chama o Service;
devolve uma resposta.


 */


package br.com.fiap.ex_semana3.controller;
import br.com.fiap.ex_semana3.dto.ProdutoRequest;
import br.com.fiap.ex_semana3.dto.ProdutoResponse;
import br.com.fiap.ex_semana3.mapper.ProdutoMapper;
import br.com.fiap.ex_semana3.model.Produto;
import br.com.fiap.ex_semana3.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {

        this.produtoService = produtoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ProdutoResponse>> findAll(){
        List<Produto> all = this.produtoService.findAll();
        return ResponseEntity.ok(ProdutoMapper.toResponse(all));
    }


    @PostMapping
    public ResponseEntity<ProdutoResponse> save(
            @RequestBody ProdutoRequest request) {

        Produto produto = ProdutoMapper.toModel(request);

        Produto salvo = produtoService.save(produto);

        return ResponseEntity.ok(
                ProdutoMapper.toResponse(salvo)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) { //Pegue o {id} que veio na URL

        produtoService.delete(id);

        return ResponseEntity.noContent().build(); //A operação deu certo, mas não tenho conteúdo para devolver
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponse> update(
            @PathVariable Long id,
            @RequestBody ProdutoRequest request) {

        Produto produto = ProdutoMapper.toModel(request);

        Produto atualizado = produtoService.update(id, produto);

        return ResponseEntity.ok(
                ProdutoMapper.toResponse(atualizado)
        );
    }



}
