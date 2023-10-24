package br.com.fiap;

import br.com.fiap.domain.entity.empresa.Cliente;
import br.com.fiap.domain.entity.empresa.Fornecedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle-fiap");
        EntityManager manager = factory.createEntityManager();

        /*Exemplo de persistência de dados

        Cliente cliente = new Cliente();
        cliente.setCnpj_c(123);
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCnpj_f(456);

        manager.persist(fornecedor);
        manager.persist(cliente);*/


        manager.close();
        factory.close();

    }
}