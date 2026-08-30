/*
ProdutoResponse
Representa aquilo que sua API devolve para o cliente.

public class ProdutoResponse {

    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;

    // getters e setters
}

A resposta:

{
    "id": 1,
    "nome": "Notebook",
    "preco": 3500.00,
    "quantidade": 10
}
 */

package br.com.fiap.ex_semana3.dto;
import java.math.BigDecimal;

// essa classe tem o id porque vai devolver o json com todas infos, porque o banco e quem vai gerar esse valor (Id)
public record ProdutoResponse(Long id,
                              String nome,
                              BigDecimal preco,
                              Integer quantidadeEmEstoque) {

}
