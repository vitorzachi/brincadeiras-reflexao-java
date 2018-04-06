package br.edu.unoesc.teste;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Test;

import br.edu.unoesc.modelo.Pessoa;

public class ConstrutorDinamicoTeste {

	@Test
	public void deveCriarNovoObjetoViaReflexao() throws Exception {
		
		Pessoa newInstance = Pessoa.class.newInstance();
		assertNotNull(newInstance);
		
		
		Constructor<?>[] constructors = Pessoa.class.getConstructors();
		assertTrue(constructors.length > 0);
		
		
		Constructor<Pessoa> constructor = Pessoa.class.getConstructor();
		Pessoa newInstance2 = constructor.newInstance();
		assertNotNull(newInstance2);
	}
	
}
