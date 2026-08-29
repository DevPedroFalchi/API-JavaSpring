/*
Mapper — transforma um objeto em outro.

Pense assim:
Mapper = tradutor.

Ele não deveria fazer regra de negócio.

Ele simplesmente transforma:

"Esse objeto aqui precisa virar aquele objeto ali."

 */

package br.com.fiap.ex_semana3.mapper;
import br.com.fiap.ex_semana3.dto.ProdutoResponse;
import br.com.fiap.ex_semana3.model.Produto;

import java.util.List;

public class ProdutoMapper {

    private ProdutoMapper(){}

    public static List<ProdutoResponse> toResponse(List<Produto> produtos){
        //to-do
        return null;
    }


}
