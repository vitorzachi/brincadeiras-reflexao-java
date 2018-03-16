package br.edu.unoesc.main;

import java.lang.reflect.Field;

public class GeradorDeClone<T> {

	private T origem;
	private T destino;

	public GeradorDeClone(T origem, T destino) throws IllegalArgumentException, IllegalAccessException {
		super();
		this.origem = origem;
		this.destino = destino;

		copiarAtributos();
	}

	private void copiarAtributos() throws IllegalArgumentException, IllegalAccessException {
		// TODOfazer as magias aqui

		Field[] fields = origem.getClass().getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);

			Object valor = field.get(origem);
			field.set(destino, valor);
		}
	}

	public T getClone() {
		return destino;
	}
}
