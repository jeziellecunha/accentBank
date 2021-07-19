package br.com.accentbank.accentBank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Extrato {
	@Id
	Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
