package br.edu.unoesc.main;

import java.lang.reflect.Field;

import br.edu.unoesc.modelo.Pessoa;

public class Main3 {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Pessoa p = new Pessoa();
		System.out.println("Valor do nome antes: " + p.getNome());

		// início da magia
		Field fieldDoNome = Pessoa.class.getDeclaredField("nome");

		fieldDoNome.setAccessible(true);
		fieldDoNome.set(p, "Reginaldo");
		// fim da magia

		System.out.println("Valor do nome depois: " + p.getNome());

	}

}
