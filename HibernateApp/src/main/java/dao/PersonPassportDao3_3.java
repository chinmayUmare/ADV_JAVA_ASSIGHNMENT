package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Address6;
import entity.Customer5;
import entity.Person3_1;

public class PersonPassportDao3_3 {

	public void add(Person3_1 person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(person); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	public Person3_1 fetchPersonByPassportNo(int passportNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select p from Person p join p.passport ps where ps.passportNo = :pno");
		q.setParameter("pno", passportNo);
		Person3_1 p = (Person3_1) q.getSingleResult(); // if only one result will come after query then we used 'getSingleResult()'
		emf.close();

		return p;
	}

	public List<Person3_1> fetchPersonsByPassportExpiryYear(int year) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select p from Person p join p.passport ps where year(ps.expiryDate) = :yr");
		//Query q = em.createQuery("select p from Passport ps join ps.person p where year(ps.expiryDate) = :yr");
		q.setParameter("yr", year);
		List<Person3_1> list = q.getResultList(); // if more than one result will come after query then we used 'getResultList()'
		emf.close();

		return list;
	}

}


