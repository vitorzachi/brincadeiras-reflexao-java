package br.edu.unoesc.modelo;

import br.edu.unoesc.logica.CampoCsv;

public class Cidade {

	private Long id;
	
	@CampoCsv(posicao = 0)
	private String codIbge;
	
	@CampoCsv(posicao = 1)
	private String nome;
	
	@CampoCsv(posicao = 2)
	private String codUf;
	
	@CampoCsv(posicao = 4)
	private String nomeUf;
	
	@CampoCsv(posicao = 3)
	private String siglaUf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(String codIbge) {
		this.codIbge = codIbge;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodUf() {
		return codUf;
	}

	public void setCodUf(String codUf) {
		this.codUf = codUf;
	}

	public String getNomeUf() {
		return nomeUf;
	}

	public void setNomeUf(String nomeUf) {
		this.nomeUf = nomeUf;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

}
