package br.com.fiap.domain.entity;

import br.com.fiap.domain.entity.empresa.Fornecedor;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @Column(name = "ID_ENDERECO")
    private Long id;
    @Column(name = "RUA_ENDERECO")
    private String rua;
    @Column(name = "CID_ENDERECO")
    private String cidade;
    @Column(name = "UF_ENDERECO")
    private String uf;
    @Column(name = "CEP_ENDERECO")
    private String cep;
    @Column(name = "NUM_ENDERECO")
    private String numero;


}
