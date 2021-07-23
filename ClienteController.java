package br.com.accentbank.accentBank.controllers;


import  br.com.accentbank.accentBank.model.Cliente;

import br.com.accentbank.accentBank.service.ClienteService;
import java.util.List;
import javax.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
		@Autowired
		ClienteService clienteService;

		@GetMapping("/cliente")
		public List<Cliente> getAllCliente() {
			return clienteService.getAllCliente();
		}

		@RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET)
		public ResponseEntity<Cliente> getById(@PathVariable(value = "id") long id) {
			return clienteService.encontrarIdCliente(id);

		}

		@RequestMapping(value = "/cliente", method = RequestMethod.POST)
		public Cliente Post(@Valid @RequestBody Cliente cliente) {
			return clienteService.Save(cliente);
		}

		@RequestMapping(value = "/cliente/{id}", method = RequestMethod.PUT)
		public ResponseEntity<Cliente> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Cliente newCliente) {
			return clienteService.atualizaCliente(id, newCliente);

		}

		@RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id) {

			return clienteService.apagarCliente(id);
		}

}
