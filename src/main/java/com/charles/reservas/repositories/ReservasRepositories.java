package com.charles.reservas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charles.reservas.entities.Reservas;

@Repository // define esta camada como camada Repository
public interface ReservasRepositories extends JpaRepository<Reservas, Long>{

	/*Mapeamento para retornar um endpoint um objeto,
	 *através do nome como parâmetro*/
	//Optional<Reservas> findByNome(String nome);
	
}
