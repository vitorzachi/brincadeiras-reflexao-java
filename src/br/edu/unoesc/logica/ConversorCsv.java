package br.edu.unoesc.logica;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConversorCsv<T> {

	private Path localizacao;
	private Class<T> tipo;
	private boolean ignoraPrimeiraLinha;

	public ConversorCsv(Path localizacao, Class<T> tipo, boolean ignoraPrimeiraLinha) {
		super();
		this.localizacao = localizacao;
		this.tipo = tipo;
		this.ignoraPrimeiraLinha = ignoraPrimeiraLinha;
	}

	public Collection<T> getDados() throws IOException, InstantiationException, IllegalAccessException {
		Collection<T> dados = new ArrayList<>();
		List<String> allLines = Files.readAllLines(localizacao);

		int count = 0;
		// para cada linha, cria um objeto novo
		for (String linha : allLines) {
			if (count == 0 && ignoraPrimeiraLinha) {
				count++;
				continue;
			}
			

			String[] split = linha.split(";", -1);

			// cria o novo objeto
			T instancia = tipo.newInstance();

			Field[] fields = tipo.getDeclaredFields();

			// popular os campos anotados
			for (Field field : fields) {
				if (field.isAnnotationPresent(CampoCsv.class)) {
					// recupera a annotation do campo
					CampoCsv campoCsv = field.getAnnotation(CampoCsv.class);
					// recupera o valor
					int posicao = campoCsv.posicao();

					String valorParaSetar = split[posicao];

					field.setAccessible(true);
					field.set(instancia, valorParaSetar);
				}
			}

			dados.add(instancia);
		}

		return dados;
	}

}
