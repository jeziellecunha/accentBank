package br.com.accentbank.accentBank.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.accentbank.accentBank.model.Endereco;



@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface CepService {
	@GetMapping("{cep}/json")
    Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);

}
