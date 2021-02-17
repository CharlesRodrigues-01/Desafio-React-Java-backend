package com.charles.reservas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charles.reservas.entities.Reservas;
import com.charles.reservas.repositories.ReservasRepositories;

@Service // define que esta classe se encontra na camada Service
public class ReservasServices {

	@Autowired // Injeção das dependências da interface UserRepositories para esta classe
	private ReservasRepositories repository;

	// método findAll() da camada repositories já é pré existente no JPA
	public List<Reservas> findAll() {
		return repository.findAll();
	}

	//método findById 
	public Reservas findById(Long id) {
		Optional<Reservas> obj = repository.findById(id);
		return obj.get();
	}
	
	/*
	 * Mapeamento para retornar um endpoint um objeto, através do nome como
	 * parâmetro
	 */
	/*public Reservas findByNome(String nome) {
		Optional<Reservas> objNome = repository.findByNome(nome);
		return objNome.get();
	}*/

	// método save() da camada repositories já é pré existente no JPA
	public Reservas insert(Reservas obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Reservas update(Long id, Reservas obj) {
		Reservas entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);

	}

	public void updateData(Reservas entity, Reservas obj) {
		entity.setNome(obj.getNome());	
		entity.setSobrenome(obj.getSobrenome());
		entity.setEmail(obj.getEmail());
		entity.setQuarto(obj.getQuarto());
		entity.setNumPessoas(obj.getNumPessoas());
		entity.setCodVoo(obj.getCodVoo());
		entity.setDataChegada(obj.getDataChegada());
		entity.setDataPartida(obj.getDataPartida());
		entity.setHoraChegada(obj.getHoraChegada());
		entity.setHoraPartida(obj.getHoraPartida());
		entity.setTranslado(obj.getTranslado());
		entity.setReqEsp(obj.getReqEsp());
		entity.setSituacao(obj.getSituacao());
	}

}
