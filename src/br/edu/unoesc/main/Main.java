package br.edu.unoesc.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.edu.unoesc.modelo.Pessoa;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {

		Pessoa p = new Pessoa();

		Field[] fields = Pessoa.class.getDeclaredFields();
		Method[] methods = Pessoa.class.getDeclaredMethods();

		System.out.println("Total fields: " + fields.length);
		System.out.println("Total métodos: " + methods.length);

		int countMetodos = 0;
		for (Method method : methods) {
			if (method.getReturnType().equals(String.class)) {
				countMetodos++;
			}
		}

		System.out.println("Métodos retornando string: " + countMetodos);

		int countField = 0;
		for (Field field : fields) {
			if (field.getType().equals(Integer.class)) {
				countField++;
			}
		}

		System.out.println("Fields tipo integer: " + countField);

		System.out.println("tipo da variavel p: " + p.getClass());
		System.out.println("tipo pessoa: " + Pessoa.class);
		System.out.println(
				Class.forName("br.edu.unoesc.modelo.Pessoa"));
		
	}
}
