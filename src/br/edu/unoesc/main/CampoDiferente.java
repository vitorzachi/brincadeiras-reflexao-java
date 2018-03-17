package br.edu.unoesc.main;

public class CampoDiferente {
	private String nomeDoCampo;

	private Object valorAntes;
	private Object valorDepois;

	public CampoDiferente(String nomeDoCampo, Object valorAntes, Object valorDepois) {
		super();
		this.nomeDoCampo = nomeDoCampo;
		this.valorAntes = valorAntes;
		this.valorDepois = valorDepois;
	}

	public String getNomeDoCampo() {
		return nomeDoCampo;
	}

	public Object getValorAntes() {
		return valorAntes;
	}

	public Object getValorDepois() {
		return valorDepois;
	}

	@Override
	public String toString() {
		return nomeDoCampo + " de [" + 
				valorAntes + "] para [" + valorDepois + "]";
	}

}
