package br.edu.unoesc.main;

import java.time.LocalDate;

import br.edu.unoesc.logica.ComparadorDeObjetos;
import br.edu.unoesc.logica.GeradorDeClone;
import br.edu.unoesc.modelo.Agenda;

public class ComparadorAgenda {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Agenda a = new Agenda();
		a.setNomePaciente("Gabriel de Jesus");
		a.setDataConsulta(LocalDate.of(2018, 6, 25));
		a.setNomeMedico("Dr Drauzio Varella");
		a.setStatus("Confirmada");
		
		Agenda b = new GeradorDeClone<>(a, new Agenda())
				.getClone();
		b.setDataConsulta(LocalDate.of(2018, 6, 15));
		
		
		new ComparadorDeObjetos<>(a, b).getDiferencas()
		.stream().forEach(diff->{
			System.out.println(diff);
		});
	}
}
