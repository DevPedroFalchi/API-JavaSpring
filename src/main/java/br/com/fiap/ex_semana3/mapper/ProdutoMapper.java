/*
Mapper — transforma um objeto em outro.

Pense assim:
Mapper = tradutor.

Ele não deveria fazer regra de negócio.

Ele simplesmente transforma:

"Esse objeto aqui precisa virar aquele objeto ali."

 */

package br.com.fiap.ex_semana3.mapper;
import br.com.fiap.ex_semana3.dto.ProdutoRequest;
import br.com.fiap.ex_semana3.dto.ProdutoResponse;
import br.com.fiap.ex_semana3.model.Produto;

import java.util.List;

public class ProdutoMapper {

    private ProdutoMapper() {}

    public static Produto toModel(ProdutoRequest request) {

        Produto produto = new Produto();

        produto.setNome(request.nome());
        produto.setPreco(request.preco());
        produto.setQuantidadeEmEstoque(request.quantidadeEmEstoque());

        return produto;
    }

    public static ProdutoResponse toResponse(Produto produto) {

        return new ProdutoResponse(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                produto.getQuantidadeEmEstoque()
        );
    }

    public static List<ProdutoResponse> toResponse(List<Produto> produtos) {

        return produtos.stream()
                .map(ProdutoMapper::toResponse)
                .toList();
    }
}
