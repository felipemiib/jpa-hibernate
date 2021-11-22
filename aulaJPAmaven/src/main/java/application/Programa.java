package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		/*
		Pessoa p1 = new Pessoa(null, "Alexandre Fragoso", "alexandre@gmail.com");
		Pessoa p2 = new Pessoa(null, "Guilherme Giba", "giba@gmail.com");
		Pessoa p3 = new Pessoa(null, "Fernanda Guerreira", "fernanda@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //cria Entity Manager Factory
		EntityManager em = emf.createEntityManager(); // cria Entity Manager
		
		//Criar tabela e inserir dados na tabela criada
		/* 
		em.getTransaction().begin(); // para inicar a transação com o banco de dados
		em.persist(p1); // inserir no banco de dados "PERSIST"
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); // para finalizar a transação com o COMIT
		*/
		
		
		//Buscar pessoa pelo ID		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		
		System.out.println("Inclusão concluída !!!!");
		em.close();
		emf.close();
		
	}

}
