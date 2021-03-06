package br.com.accentbank.accentBank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.accentbank.accentBank.model.Extrato;
import br.com.accentbank.accentBank.service.ExtratoService;

@RestController
@RequestMapping("/extrato")
public class ExtratoController {
//retornar todos os extratos pelo número da conta
	
	@Autowired
	private ExtratoService service;
	
	@GetMapping("/{numeroDaConta}")
	public List<Extrato> retornaTodosExtratosPorConta(@PathVariable String numeroDaConta){
		
		return service.buscarExtratosDaConta(numeroDaConta);
	}
	@PostMapping
	public ResponseEntity<Extrato> incluirMovimentacao(@RequestBody Extrato movimentacao){
		
		
		return null;
	}
}
