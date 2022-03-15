package com.mjv.app;

import java.util.List;

import com.mjv.model.Categoria;
import com.mjv.model.Contato;
import com.mjv.repository.ContatoRepository;

public class AgendaApp {
	public static void main(String[] args) throws Exception {

		// criação dos contatos
		Contato contato1 = new Contato();
		contato1.setNome("Athos Franco");
		contato1.setEmail("athos.francof@gmail.com");
		contato1.setTelefone("98 98208-0536");

		contato1.setCategoria(Categoria.FAMILIA);
		contato1.setObservacao("Meu número atual");
		contato1.setAtivo(true);

		Contato contato2 = new Contato();
		contato2.setNome("Gleyson Sampaio");
		contato2.setEmail("gleyson_sampaio@gmail.com");
		contato2.setTelefone("11 11111-1111");
		contato2.setCategoria(Categoria.PROFISSIONAL);
		contato2.setObservacao("Professor da MJV School");
		contato2.setAtivo(true);

		Contato contato3 = new Contato();
		contato3.setNome("João da Silva");
		contato3.setEmail("joao_silva@gmail.com");
		contato3.setTelefone("22 22222-2222");
		contato3.setCategoria(Categoria.AMIGOS);
		contato3.setObservacao("Contato teste");
		contato3.setAtivo(true);

		Contato contato4 = new Contato();
		contato4.setNome("Pizzaria");
		contato4.setTelefone("33 33333-3333");
		contato4.setCategoria(Categoria.OUTROS);
		contato4.setObservacao("Pizzaria do bairro");
		contato4.setAtivo(true);

		Contato contato5 = new Contato();
		contato5.setNome("Marcio Feitosa");
		contato5.setTelefone("44 44444-44444");
		contato5.setEmail("marcio_feitosa@gmail.com");
		contato5.setCategoria(Categoria.FAMILIA);
		contato5.setAtivo(true);

		Contato contato6 = new Contato();
		contato6.setNome("Claudio Silva");
		contato6.setTelefone("55 55555-5555");
		contato6.setCategoria(Categoria.OUTROS);
		contato6.setObservacao("Número atual do eletricista");
		contato6.setAtivo(true);

		// repository
		ContatoRepository cr = new ContatoRepository();

		// registrar os contatos no postgres
		/*
		cr.registrar(contato1);
		cr.registrar(contato2);
		cr.registrar(contato3);
		cr.registrar(contato4);
		cr.registrar(contato5);
		cr.registrar(contato6);
		

		// buscar contato por ID
		Contato contatoMapeado = cr.findById(2);
		System.out.println(contatoMapeado.toString());

		// buscar todos os contatos
		List<Contato> todosContatos = cr.findAll();
		for (Contato c : todosContatos) {
			System.out.println(c);
		}
		
		// buscar dados por CATEGORIA
		List<Contato> contatosFamilia = cr.findByCategory(Categoria.FAMILIA);
		for (Contato c : contatosFamilia) {
			System.out.println(c);
		}
		
		// buscar dados por NOME
		String pesquisa = "Gley";
		List<Contato> contatosIncluindoNome = cr.findByName(pesquisa);
		for (Contato c : contatosIncluindoNome) {
			System.out.println(c);
		}
		
		*/
		
		////////////////////// JDBC ANTIGO

		/*
		 * AlunoRepository repository = new AlunoRepository();
		 * 
		 * 
		 * Aluno athos = new Aluno(); athos.setNome("AthosTeste"); //
		 * athos.setAltura(2.75); athos.setSexo("M"); athos.setAtivo(true);
		 * 
		 * // repository.registrar(athos);
		 * 
		 * athos.setAltura(1.72);
		 * 
		 * // repository.remover(16);
		 * 
		 * // athos.setAltura(1.72);
		 * 
		 * repository.update(athos, 17);
		 */

	}

}
