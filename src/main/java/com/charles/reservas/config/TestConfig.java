package com.charles.reservas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.charles.reservas.entities.Reservas;
import com.charles.reservas.repositories.ReservasRepositories;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired // Injeção das dependências da interface UserRepositories para esta classe
	private ReservasRepositories reservasRepository;

	@Override // sobrescreve e insere manualmente os objetos abaixo
	public void run(String... args) throws Exception {

		// inserção de usuários
		Reservas u1 = new Reservas(null, "Maria", "Brown", "maria@gmail.com", "teste", 2, "teste", "2020-01-02", "2020-01-03", "10:30", "11:30", "sim", "teste", "Aberto");
		Reservas u2 = new Reservas(null, "Alex", "Green'", "alex@gmail.com", "teste", 2, "teste", "2021-02-02", "2020-01-03", "10:30", "11:30", "não", "teste", "Fechado");

		// Salva os dados acima no banco de dados através da camada Repositories
		reservasRepository.saveAll(Arrays.asList(u1, u2));
	}
}
