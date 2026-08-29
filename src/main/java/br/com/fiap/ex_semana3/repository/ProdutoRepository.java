package br.com.fiap.ex_semana3.repository;

import br.com.fiap.ex_semana3.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
