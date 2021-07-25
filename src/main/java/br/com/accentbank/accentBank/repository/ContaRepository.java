package br.com.accentbank.accentBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accentbank.accentBank.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{
	

}
