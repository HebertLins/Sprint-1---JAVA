package br.com.fiap.domain.entity.empresa;


import br.com.fiap.domain.entity.Endereco;
import br.com.fiap.domain.entity.Material;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_FORNECEDOR", uniqueConstraints = {
        @UniqueConstraint(name = "UK_FOR_CPF", columnNames = "CNPJ_FORNECEDOR")
})
@DiscriminatorValue("FORNECEDOR")
public class Fornecedor extends Empresa{

    @Column(name = "CNPJ_FORNECEDOR", nullable = false)
    private int cnpj_c;

    public Fornecedor() {
        super("FORNECEDOR");
    }

    @Column(name = "AVALIACAO_FORNECEDOR")
    private double avaliacao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_MATERIAL",
            referencedColumnName = "ID_MATERIAL",
            foreignKey = @ForeignKey(name = "FK_MATERIAL_FORNCEDOR")
    )
    private Material material;

    public Fornecedor(Long id, String nome, String descricao, int cnpj, Endereco endereco, double avaliacao, Material material) {
        super(id, nome, descricao, cnpj, "FORNECEDOR", endereco);
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Material getMateriais() {
        return material;
    }

    public void setMateriais(Material materiais) {
        this.material = materiais;
    }

    @Override
    public String toString() {return "Fornecedor{}" + super.toString();}
}
