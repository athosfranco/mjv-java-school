package com.mjv.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mjv.model.Categoria;
import com.mjv.model.Contato;

public class ContatoRepository {
	private EntityManager em;

	public ContatoRepository() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Contatos-PU");
		em = entityManagerFactory.createEntityManager();
	}

	//inserir registro
	public void registrar(Contato contato) {
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
	}
	
	
	
	


	// buscar por ID
	public Contato findById(Integer id) {

		Contato contato = em.find(Contato.class, id);
		System.out.println("[RESULTADO BUSCA DE CONTATO COM ID #" + id + " ]");
		return contato;
	}

	// buscar todos

	public List<Contato> findAll() {
		System.out.println("[RESULTADO BUSCA DE TODOS OS CONTATOS]");
		Query query = em.createQuery("SELECT c FROM Contato c"); // JPQL - query é baseado no OBJETO

		return query.getResultList();
	}

	// buscar por categoria
	public List<Contato> findByCategory(Categoria categoria) {
		System.out.println("[Buscando todos os contatos da categoria '" + categoria.getDescricao() + "' ]");

		Query query = em.createQuery("SELECT c FROM Contato c WHERE c.categoria = :categoria");
		query.setParameter("categoria", categoria); // parametro do query definido
		return query.getResultList();

	}

	// buscar por nome (usando a expressao LIKE % %)
	public List<Contato> findByName(String pesquisa) {
		System.out.println("[Buscando contatos cujo nome possui: " + pesquisa + " ]");

		Query query = em.createQuery("SELECT c FROM Contato c WHERE c.nome LIKE CONCAT('%', :pesquisa, '%')");
		query.setParameter("pesquisa", pesquisa);

		return query.getResultList();

	}

}
