package br.com.fiap.clientes.controller;

import br.com.fiap.clientes.domain.BoletoStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.clientes.domain.Boleto;
import br.com.fiap.clientes.domain.Cliente;
import br.com.fiap.clientes.repository.BoletoRepository;
import br.com.fiap.clientes.repository.ClienteRepository;
import br.com.fiap.clientes.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClientesResource {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private BoletoRepository boletoRepository;

	@GetMapping("saldo/{id}")
	public Cliente buscarSaldo(@PathVariable long id) {
		return clienteRepository.findById(id);
	}

	@PostMapping("adicionar")
	public Cliente adicionarCliente(@RequestBody Cliente cliente){

		return clienteRepository.save(cliente);
	}

}