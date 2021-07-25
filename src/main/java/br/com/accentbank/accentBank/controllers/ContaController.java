package br.com.accentbank.accentBank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.accentbank.accentBank.model.Conta;
import br.com.accentbank.accentBank.service.ContaService;

@RestController
@RequestMapping("/conta")
public class ContaController {

	@Autowired
	private ContaService service;

	// getAll

	@GetMapping("/todos")
	public List<Conta> getAll() {

		return service.buscarTodos();
	}

	// getById
	@GetMapping("/{id}")
	public Conta getById(@PathVariable Long id) {
		
		return service.getById(id);
		
	}

	// post
	@PostMapping("/nova")
	public Conta criarConta(@RequestBody Conta conta) {
			
		return service.criarConta(conta);
	}

	// put
	
	

	// deleteById

}
