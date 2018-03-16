package br.edu.unoesc.main;

import java.time.LocalDate;

import br.edu.unoesc.modelo.Pessoa;

public class Main4 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Pessoa origem = new Pessoa("pessoanome", " pessoa sobrenome", LocalDate.now());

		Pessoa clone = new GeradorDeClone<>(origem, new Pessoa()).getClone();

		System.out.println(clone.getNome());
		System.out.println(clone.getSobrenome());
		System.out.println(clone.getDataNascimento());
	}
}
