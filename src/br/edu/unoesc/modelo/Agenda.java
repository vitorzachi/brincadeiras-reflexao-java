package br.edu.unoesc.modelo;

import java.time.LocalDate;

import br.edu.unoesc.logica.CampoParaComparacao;

public class Agenda {

	private String nomePaciente;
	
	@CampoParaComparacao
	private String nomeMedico;
	
	@CampoParaComparacao
	private LocalDate dataConsulta;

	@CampoParaComparacao
	private String status;

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
