/*
Repository - conversa com o banco
É aqui que você coloca operações relacionadas ao acesso aos dados.

Exemplos:

produtoRepository.findAll();

produtoRepository.findById(id);

produtoRepository.save(produto);

produtoRepository.deleteById(id);

REPOSITORY = banco de dados.

Ele não deveria decidir regras de negócio.

Por exemplo, não é responsabilidade do Repository decidir:

"Produto com preço negativo pode ser cadastrado?"

Isso é regra de negócio → Service.

 */

package br.com.fiap.ex_semana3.repository;
import br.com.fiap.ex_semana3.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
