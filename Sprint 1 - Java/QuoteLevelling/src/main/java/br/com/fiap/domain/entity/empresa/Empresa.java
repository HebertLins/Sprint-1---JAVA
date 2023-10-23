package br.com.fiap.domain.entity.empresa;

import br.com.fiap.domain.entity.Endereco;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_EMPRESA")
@Inheritance(strategy = InheritanceType.JOINED)
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMPRESA")
    @Column(name = "ID_EMPRESA")
    private Long id;
    @Column(name = "NM_EMPRESA")
    private String nome;

    @Column(name = "DESC_EMPRESA")
    private String descricao;

    @Column(name = "TP_EMPRESA")
    private String tipo;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_ENDERECO",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_EMPRESA_ENDERECO")
    )
    private Endereco endereco;

    public Empresa() {
    }



    public Empresa(String tipo) {
        this.tipo = tipo;
    }

    public Empresa(Long id, String nome, String descricao, int cnpj, String cliente, Endereco endereco) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
