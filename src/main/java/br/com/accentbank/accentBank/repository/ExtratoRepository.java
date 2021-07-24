package br.com.accentbank.accentBank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accentbank.accentBank.model.Extrato;

public interface ExtratoRepository extends JpaRepository<Extrato,Long>{

	List<Extrato> findByContaNumero(String numero);
	
}
