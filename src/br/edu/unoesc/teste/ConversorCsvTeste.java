package br.edu.unoesc.teste;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;

import org.junit.Test;

import br.edu.unoesc.logica.ConversorCsv;
import br.edu.unoesc.modelo.Cidade;

public class ConversorCsvTeste {

	@Test
	public void deveConverterArquivoCsv() throws Exception {
		
		Path caminho = Paths.get("/home/vitor/Documentos/"
				+ "Materiais aulas/UNOESC/ccc 3 - reflection/"
				+ "cidades.csv");
		
		
		Collection<Cidade> dados = new ConversorCsv<>
				(caminho, Cidade.class, true).getDados();
		
		// confere se a lista tem itens dentro
		assertFalse(dados.isEmpty());
		
		dados.forEach(c->{
			System.out.println(c.getNome());
		});
	}
}
