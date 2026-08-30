/*
DTO — dados que entram e saem da API.
É uma classe usada para transportar dados entre partes da aplicação, principalmente entre sua API e o cliente.

ProdutoRequest
Representa aquilo que o cliente manda para sua API.

O cliente manda:

{
    "nome": "Notebook",
    "preco": 3500.00,
    "quantidade": 10
}

 */

package br.com.fiap.ex_semana3.dto;

import java.math.BigDecimal;

// Nao tem o id porque ja é gerado pelo @GeneratedValue da classe Produto
public record ProdutoRequest(String nome,
                             BigDecimal preco,
                             Integer quantidadeEmEstoque){


}
