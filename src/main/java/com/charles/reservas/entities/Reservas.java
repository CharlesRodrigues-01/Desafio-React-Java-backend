package com.charles.reservas.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // define que a Classe User se encontra na camada Entities
public class Reservas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define o id como primary keys
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String quarto;
	private Integer numPessoas;
	private String codVoo;
	private String dataChegada;
	private String dataPartida;
	private String horaChegada;
	private String horaPartida;
	private String translado;
	private String reqEsp;
	private String situacao;

	// construtor padrão
	public Reservas() {
	}

	// construtor com argumentos

	public Reservas(Long id, String nome, String sobrenome, String email, String quarto, Integer numPessoas,
			String codVoo, String dataChegada, String dataPartida, String horaChegada, String horaPartida,
			String translado, String reqEsp, String situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.quarto = quarto;
		this.numPessoas = numPessoas;
		this.codVoo = codVoo;
		this.dataChegada = dataChegada;
		this.dataPartida = dataPartida;
		this.horaChegada = horaChegada;
		this.horaPartida = horaPartida;
		this.translado = translado;
		this.reqEsp = reqEsp;
		this.situacao = situacao;
	}
	
	// -----Getters e Setters------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuarto() {
		return quarto;
	}

	public void setQuarto(String quarto) {
		this.quarto = quarto;
	}

	public Integer getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(Integer numPessoas) {
		this.numPessoas = numPessoas;
	}

	public String getCodVoo() {
		return codVoo;
	}

	public void setCodVoo(String codVoo) {
		this.codVoo = codVoo;
	}

	public String getReqEsp() {
		return reqEsp;
	}

	public void setReqEsp(String reqEsp) {
		this.reqEsp = reqEsp;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTranslado() {
		return translado;
	}

	public void setTranslado(String translado) {
		this.translado = translado;
	}

	public String getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}
	
	public String getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(String dataPartida) {
		this.dataPartida = dataPartida;
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}

	public String getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}

	// -----HashCode e Equals------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservas other = (Reservas) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}