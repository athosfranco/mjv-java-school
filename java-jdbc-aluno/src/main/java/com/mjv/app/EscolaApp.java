package com.mjv.app;

import com.mjv.model.Aluno;
import com.mjv.repository.AlunoRepository;

public class EscolaApp {
	public static void main(String[] args) throws Exception {
		AlunoRepository repository = new AlunoRepository();

		Aluno athos = new Aluno();
		athos.setNome("AthosTeste");
		// athos.setAltura(2.75);
		athos.setSexo("M");
		athos.setAtivo(true);

		// repository.registrar(athos);

		athos.setAltura(1.72);

		// repository.remover(16);

		// athos.setAltura(1.72);

		repository.update(athos, 17);

	}

}
