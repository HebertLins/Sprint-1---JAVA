package br.com.fiap.domain.entity;

import br.com.fiap.domain.entity.empresa.Cliente;
import br.com.fiap.domain.entity.empresa.Fornecedor;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_COTACAO")
public class Cotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMPRESA")
    @Column(name = "ID_COTACAO")
    private Long id;
    @Column(name = "VALTOT_COTACAO")
    private double valTotal;
    @Column(name = "QTDTOT_COTACAO")
    private int qtdTotal;
    @Column(name = "ITENS_COTACAO")
    private String itens;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_FORNECEDOR",
            referencedColumnName = "CNPJ_FORNECEDOR",
            foreignKey = @ForeignKey(name = "FK_COTACAO_FORNECEDOR")
    )
    private Fornecedor fornecedor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_CLIENTE",
            referencedColumnName = "CNPJ_CLIENTE",
            foreignKey = @ForeignKey(name = "FK_COTACAO_CLIENTE")
    )
    private Cliente cliente;

}
