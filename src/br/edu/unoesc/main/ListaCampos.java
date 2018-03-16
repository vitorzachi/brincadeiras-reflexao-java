package br.edu.unoesc.main;

import java.lang.reflect.Field;

public class ListaCampos {

	
	public static void listar(Class<?> classe){
		
		Field[] fields = classe.getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		
	}
	
	
}
