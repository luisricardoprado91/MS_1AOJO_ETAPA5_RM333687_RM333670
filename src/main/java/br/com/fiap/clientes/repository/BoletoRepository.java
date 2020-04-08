package br.com.fiap.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.clientes.domain.Boleto;
import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.Id;
import java.util.List;

public interface BoletoRepository extends JpaRepository<Boleto, Id> {

	Boleto findById(long Id);

}
