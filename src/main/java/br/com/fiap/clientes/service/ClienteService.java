package br.com.fiap.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.clientes.domain.Boleto;
import br.com.fiap.clientes.domain.BoletoStatus;
import br.com.fiap.clientes.domain.Cliente;
import br.com.fiap.clientes.repository.BoletoRepository;
import br.com.fiap.clientes.repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;
	private final BoletoRepository boletoRepository;

	@Autowired
	public ClienteService(final ClienteRepository clienteRepository, final BoletoRepository boletoRepository) {
		this.clienteRepository = clienteRepository;
		this.boletoRepository = boletoRepository;
	}

	public void adiconarSaldoAoCliente(final long userId, final double valorAdiconar){

		Cliente cliente = new Cliente().setId(userId);
		cliente.setSaldo(cliente.getSaldo() + valorAdiconar);

		clienteRepository.save(cliente);

	}


}
