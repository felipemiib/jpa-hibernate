package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Felipe Figueiredo", "felipe@gmail.com");
		Pessoa p3 = new Pessoa(null, "Valdenise Barreto", "val@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //cria Entity Manager Factory
		EntityManager em = emf.createEntityManager(); // cria Entity Manager
		
		em.getTransaction().begin(); // para inicar a transação com o banco de dados
		em.persist(p1); // inserir no banco de dados "PERSIST"
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); // para finalizar a transação com o COMIT
		
		System.out.println("Inclusão concluída !!!!");
		

	}

}
