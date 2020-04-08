package br.com.fiap.clientes.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "boleto", sequenceName = "SQ_BOLETO", allocationSize = 1)
public class Boleto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boleto")
	long id;
	long userId;
	double preco;
	@Enumerated(EnumType.STRING)
	private BoletoStatus boletoStatus;

	public Boleto() {

	}

	public Boleto(final long Id, final long userId, final double preco, final BoletoStatus boletoStatus) {
		this.id = Id;
		this.userId = userId;
		this.preco = preco;
		this.boletoStatus = boletoStatus;

	}

	public Boleto setId(long id) {
		this.id = id;
		return this;
	}

	public long getId() {
		return this.id;
	}

	public Boleto setUserId(long userId) {
		this.userId = userId;
		return this;
	}

	public long getUserId() {
		return this.userId;
	}

	public Boleto setPreco(double valor) {
		this.preco = valor;
		return this;
	}

	public double getPreco() {
		return this.preco;
	}

	public Boleto setStatus(BoletoStatus boletoStatus) {
		this.boletoStatus = boletoStatus;
		return this;
	}

	public BoletoStatus getStatus() {
		return this.boletoStatus;
	}

}
