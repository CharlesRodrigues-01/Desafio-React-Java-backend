package com.charles.reservas.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.charles.reservas.entities.Reservas;
import com.charles.reservas.services.ReservasServices;

@RestController // define que esta classe se encontra na camada Rest Controller/Resources
@RequestMapping(value = "/reservas") // caminho para acesso aos dados dos usuários
public class ReservasResources {

	@Autowired // Injeção das dependências da classe UserServices para esta classe
	private ReservasServices service;

	@GetMapping // Mapeamento para requisições HTTP GET, retorna uma lista de usuários
	public ResponseEntity<List<Reservas>> findAll() {
		List<Reservas> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	// método findById 
	@GetMapping(value = "/{id}")
	public ResponseEntity<Reservas> findById(@PathVariable Long id) {
		Reservas obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	/*
	 * Mapeamento para retornar um endpoint um objeto, através do nome como
	 * parâmetro
	 */
	/*@GetMapping(value = "/{nome}")
	public ResponseEntity<Reservas> findByNome(@PathVariable String nome) {
		Reservas objNome = service.findByNome(nome);
		return ResponseEntity.ok().body(objNome);
	}*/

	// Mapeamento para requisições HTTP POST, cria um usuário sem nenhuma aposta
	@PostMapping
	public ResponseEntity<Reservas> insert(@RequestBody Reservas obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}") 
	public ResponseEntity<Reservas> update(@PathVariable Long id, @RequestBody Reservas obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
}
