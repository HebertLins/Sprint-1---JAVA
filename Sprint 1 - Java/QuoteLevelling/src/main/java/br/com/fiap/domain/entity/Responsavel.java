package br.com.fiap.domain.entity;


import br.com.fiap.domain.entity.empresa.Empresa;
import br.com.fiap.domain.entity.empresa.Fornecedor;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_RESPONSAVEL")
@Inheritance(strategy = InheritanceType.JOINED)
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMPRESA")
    @Column(name = "ID_RESPONSAVEL")
    private int id;
    @Column(name = "NM_RESPONSAVEL")
    private String nome;
    @Column(name = "DESC_RESPONSAVEL")
    private String desricao;
    @Column(name = "MATRI_RESPONSAVEL")
    private String matricula;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_EMPRESA",
            referencedColumnName = "ID_EMPRESA",
            foreignKey = @ForeignKey(name = "FK_RESPONSAVEL_EMPRESA")
    )
    private Empresa empresa;
}
