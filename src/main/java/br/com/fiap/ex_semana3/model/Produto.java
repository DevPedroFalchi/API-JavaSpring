/*
Model - Representa os dados do sistema
Representa as entidades do sistema, normalmente
correspondendo as tabelas do banco.

O que colocar no model?
atributos da entidade;
@Entity;
@Id;
relacionamentos (@OneToMany, @ManyToOne, etc.);
@getters/setters;
eventualmente regras simples diretamente relacionadas à entidade.
 */


package br.com.fiap.ex_semana3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private BigDecimal preco;

    private Integer quantidadeEmEstoque;
}
