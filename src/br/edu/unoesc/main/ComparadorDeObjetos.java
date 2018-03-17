package br.edu.unoesc.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

public class ComparadorDeObjetos<T> {

	private T antes;
	private T depois;

	public ComparadorDeObjetos(T antes, T depois) {
		super();
		this.antes = antes;
		this.depois = depois;
	}

	public Collection<CampoDiferente> getDiferencas() throws IllegalArgumentException, IllegalAccessException {
		Collection<CampoDiferente> campos = new ArrayList<>();

		Field[] fields = antes.getClass().getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);
			Object valorAntes = field.get(antes);
			Object valorDepois = field.get(depois);

			if (!valorAntes.equals(valorDepois)) {
				CampoDiferente cd = new 
						CampoDiferente(field.getName(), valorAntes,
								valorDepois);
				
				campos.add(cd);
			}

		}

		return campos;
	}

}
