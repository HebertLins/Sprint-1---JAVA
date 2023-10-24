package br.com.fiap.domain.entity.empresa;

import br.com.fiap.domain.entity.Endereco;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_CLIENTE", uniqueConstraints = {
        @UniqueConstraint(name = "UK_CLI_CPF", columnNames = "CNPJ_CLIENTE")
})
@DiscriminatorValue("CLIENTE")
public class Cliente extends Empresa{

    @Column(name = "CNPJ_CLIENTE", nullable = false)
    private int cnpj_c;


    public Cliente() {
        super("CLIENTE");
    }


    public int getCnpj_c() {
        return cnpj_c;
    }

    public void setCnpj_c(int cnpj_c) {
        this.cnpj_c = cnpj_c;
    }

    public Cliente(Long id, String nome, String descricao, int cnpj, Endereco endereco) {
        super(id, nome, descricao, cnpj, "CLIENTE", endereco);
    }

    @Override
    public String toString() {return "Cliente{}" + super.toString();}
}
