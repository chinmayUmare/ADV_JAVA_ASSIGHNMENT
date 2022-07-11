package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Address6;
import entity.Customer5;
import entity.Employee1;

public class CustomerAddressDao7 {

	public void add(Customer5 cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(cust); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}

	public void update(Customer5 cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(cust); //merge method will generate update query
		
		tx.commit();
		emf.close();
	}

	public Customer5 fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Customer5 emp = em.find(Customer5.class, id);
		
		emf.close();

		return emp;	
	}

	public List<Customer5> fetchCustomersByEmail(String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer5 c where c.email like :em");
		q.setParameter("em", "%" + domain + "%");
		List<Customer5> list = q.getResultList();
		
		emf.close();

		return list;
	}

	public List<Customer5> fetchCustomersByCity(String city) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer5 c join c.address a where a.city = :ct");
		q.setParameter("ct", city);
		List<Customer5> list = q.getResultList();
		
		emf.close();

		return list;
	}

	public Address6 fetchAddressByCustomerName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select a from Customer5 c join c.address a where c.name = :nm");
		q.setParameter("nm", name);
		Address6 addr = (Address6) q.getSingleResult();
		
		emf.close();

		return addr;
	}

	public void add(Address6 addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}

	public Address6 fetchAddress(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Address6 addr = em.find(Address6.class, id);
		
		emf.close();

		return addr;	
	}

}
