package br.edu.unoesc.main;

import java.time.LocalDate;
import java.util.Collection;

import br.edu.unoesc.modelo.Pessoa;

public class ComparadorMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Pessoa p1 = new Pessoa("Maurício", "Berté", LocalDate.now());
		Pessoa p2 = new Pessoa("Eduardo", "Berté", LocalDate.now());
	
	
		Collection<CampoDiferente> diferencas = 
				new ComparadorDeObjetos<>(p1, p2).getDiferencas();
		
		diferencas.forEach(c->{
			System.out.println(c);
		});
	
	}
}
