package br.edu.unoesc.main;

public class GeradorDeClone<T> {

	private T origem;
	private T destino;
	
	public GeradorDeClone(T origem, T destino) {
		super();
		this.origem = origem;
		this.destino = destino;
		
		copiarAtributos();
	}
	
	
	private void copiarAtributos(){
		// TODO fazer as magias aqui
	}
	
	public T getClone(){
		return destino;
	}
}
