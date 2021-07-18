package br.com.accentbank.accentBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accentbank.accentBank.model.Extrato;

public interface ExtratoRepository extends JpaRepository<Extrato,Long>{
	
}
