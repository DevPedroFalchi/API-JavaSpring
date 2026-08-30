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

//intermediario entre o Controller e o banco
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository; //O Service precisa do Repository
                                                    //porque o Service precisa acessar os dados,
                                                    //mas quem efetivamente conversa com o banco é o Repository
                                                //O Spring entrega essa dependência ao Service através do construtor

    //Para criar um ProdutoService, preciso receber um ProdutoRepository
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository; //Pegue o Repository que recebi no construtor e guarde no atributo do Service
    }                                               //Depois, qualquer método do Service pode usar this.produtoRepository

    public List<Produto> findAll(){
        return this.produtoRepository.findAll();
    }

    public Produto save(Produto produto){
        return this.produtoRepository.save(produto);
    }

    public void delete(Long id) {
        this.produtoRepository.deleteById(id);
    }

    public Produto update(Long id, Produto produto) {

        Produto produtoExistente = produtoRepository.findById(id) //Repository, existe um produto com esse ID?
                .orElseThrow(() -> // se encontrou continua, senao lança erro
                        new RuntimeException("Produto não encontrado")
                );

        produtoExistente.setNome(produto.getNome()); //Estamos pegando os dados novos e colocando no produto que já existe
        produtoExistente.setPreco(produto.getPreco());
        produtoExistente.setQuantidadeEmEstoque(
                produto.getQuantidadeEmEstoque()
        );

        return produtoRepository.save(produtoExistente);
    }



}
