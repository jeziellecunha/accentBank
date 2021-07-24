package br.com.accentbank.accentBank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import javax.persistence.OneToMany;

@Entity
public class Agencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAgencia;
	private String nome;

	@OneToOne
	private Endereco endereco;

	public Agencia() {
	}

	public Agencia(long idAgencia, String nome, Endereco endereco) {
		super();
		this.idAgencia = idAgencia;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	// @OneToMany
//	    private Conta conta;
	public long getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(long idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
