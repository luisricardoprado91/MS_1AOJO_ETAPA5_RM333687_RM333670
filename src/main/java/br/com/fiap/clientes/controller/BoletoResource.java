package br.com.fiap.clientes.controller;

import br.com.fiap.clientes.domain.Boleto;
import br.com.fiap.clientes.domain.BoletoStatus;
import br.com.fiap.clientes.repository.BoletoRepository;
import br.com.fiap.clientes.repository.ClienteRepository;
import br.com.fiap.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boleto")
public class BoletoResource {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private BoletoRepository boletoRepository;
    @Autowired
    private ClienteService clienteService;

    @PostMapping("adicionar")
    public Boleto adiconarBoleto(@RequestBody Boleto boleto) {

        boleto.setStatus(BoletoStatus.NAO_PAGO);
        return boletoRepository.save(boleto);
    }

    @PutMapping("pagar/{id}")
    public Boleto pagarBoleto(@PathVariable long id) {

        Boleto boleto = boletoRepository.findById(id);
        clienteService.adiconarSaldoAoCliente(boleto.getUserId(), boleto.getPreco());
        boleto.setStatus(BoletoStatus.PAGO);

        return boletoRepository.save(boleto);
    }

    @GetMapping("status/{id}")
    public BoletoStatus statusBoleto(@PathVariable long id){

        BoletoStatus status =  boletoRepository.findById(id).getStatus();
        return status;
    }




}
