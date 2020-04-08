package br.com.fiap.clientes.repository;

import br.com.fiap.clientes.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.clientes.domain.Cliente;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, ID> {

	Cliente findById(long id);
}
