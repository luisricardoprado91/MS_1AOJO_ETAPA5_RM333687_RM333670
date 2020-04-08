package br.com.fiap.clientes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.sun.istack.NotNull;

@Entity
@SequenceGenerator(name = "cliente", sequenceName = "SQ_CLIENTE", allocationSize = 1)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	long id;
	@NotNull
	double saldo;
	@NotNull
	String nome;

	public Cliente() {

	}

	public Cliente(final long id, final double saldo, final String nome) {
		this.id = id;
		this.saldo = saldo;
		this.nome =nome;
	}

	public long getId() {
		return id;
	}

	public Cliente setId(final long id) {
		this.id = id;
		return this;
	}

	public Cliente setSaldo(double saldo) {
		this.saldo = saldo;
		return this;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente setNome(String nome){
		this.nome = nome;
		return this;

	}
}
