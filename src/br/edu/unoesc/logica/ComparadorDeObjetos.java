package br.edu.unoesc.logica;

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

			boolean permiteComparar = field.isAnnotationPresent
					(CampoParaComparacao.class);

			if (permiteComparar) {

				field.setAccessible(true);
				Object valorAntes = field.get(antes);
				Object valorDepois = field.get(depois);

				if (valorAntes == null && valorDepois == null) {
					continue;
				} else if ((valorAntes == null && valorDepois != null) || (valorAntes != null && valorDepois == null)) {

					CampoDiferente cd = new CampoDiferente(field.getName(), valorAntes, valorDepois);

					campos.add(cd);
				} else if (!valorAntes.equals(valorDepois)) {
					CampoDiferente cd = new CampoDiferente(field.getName(), valorAntes, valorDepois);

					campos.add(cd);
				}
			}
		}

		return campos;
	}

}
