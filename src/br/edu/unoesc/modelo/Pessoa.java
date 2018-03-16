package br.edu.unoesc.modelo;

import java.time.LocalDate;

public class Pessoa {

	private String nome;

	private String sobrenome;

	private LocalDate dataNascimento;

	public Pessoa() {
	}

	public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
}
