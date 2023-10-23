package br.com.fiap.domain.entity;

import br.com.fiap.domain.entity.empresa.Fornecedor;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_MATERIAL")
@Inheritance(strategy = InheritanceType.JOINED)
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMPRESA")
    @Column(name = "ID_MATERIAL")
    private Long id;

    @Column(name = "NM_MATERIAL")
    private String nome;

    @Column(name = "QTD_MATERIAL")
    private int qtd;
    @Column(name = "VALUNIT_MATERIAL")
    private double ValUnit;

    @Column(name = "DESC_MATERIAL")
    private String descricao;


}
