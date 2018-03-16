package br.edu.unoesc.main;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) 
			throws ClassNotFoundException {
		
		ListaCampos.listar(ArrayList.class);
		
		System.out.println("------");
		
		ListaCampos.listar(Class.forName("java.lang.String"));
		
		System.out.println("-----");
		
		ListaCampos.listar(Class.class);
		
		
		System.out.println("------");
		
		ListaCampos.listar(
				Class.forName("br.com.delta.TransDaEsquina"));
		
	}
}
