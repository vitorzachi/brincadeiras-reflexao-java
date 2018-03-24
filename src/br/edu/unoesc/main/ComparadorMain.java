package br.edu.unoesc.main;

import java.time.LocalDate;
import java.util.Collection;

import br.edu.unoesc.logica.CampoDiferente;
import br.edu.unoesc.logica.ComparadorDeObjetos;
import br.edu.unoesc.modelo.Pessoa;

public class ComparadorMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Pessoa p1 = new Pessoa("Maurício", "kk", LocalDate.now());
		Pessoa p2 = new Pessoa("Eduardo", "Berté", LocalDate.now());
	
	
		Collection<CampoDiferente> diferencas = 
				new ComparadorDeObjetos<>(p1, p2).getDiferencas();
		
		diferencas.forEach(c->{
			System.out.println(c);
		});
		
		
		Pessoa p3 = new Pessoa("Maurício", "Berté", null);
		Pessoa p4 = new Pessoa("Maurício", "Berté", null);
		diferencas = 
				new ComparadorDeObjetos<>(p3, p4).getDiferencas();
		
		diferencas.forEach(c->{
			System.out.println(c);
		});
		
	
	}
}
