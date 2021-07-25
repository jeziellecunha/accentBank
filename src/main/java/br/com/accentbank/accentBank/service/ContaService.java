package br.com.accentbank.accentBank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.accentbank.accentBank.model.Conta;
import br.com.accentbank.accentBank.repository.ContaRepository;
@Service
public class ContaService {
	
	@Autowired
	private ContaRepository repository;

	public List<Conta> buscarTodos() {
		
		return repository.findAll();
	}

	public Conta getById(Long id) {
		
		Optional<Conta> contaRequerida = repository.findById(id);
		
		return contaRequerida.get();
		
	}

	public Conta criarConta(Conta conta) {
		
		return repository.save(conta);
	}

	

}
