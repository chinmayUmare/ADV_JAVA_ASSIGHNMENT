package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Customer5;

public class GenericDao4_3 { //CommonDao, SabkaDao, GhargutiDao, ...

	//for persist or merge method we write one method in earlier example such as in 'CustomerAddressDao7' and 
	//that one method again write for 'CustomerAddressDao7' chya 'addAddress' method mdhe. So why don't we write it once and reused that method
	// again and again, and also persist() and merge() method take object as parameter, so for that we used parent of
	// all object i.e. Object class cha object(obj) as parameter and Hence we take 'Object obj' in follwing method 
	public void save(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
	
			//merge is a 2-in-1 method
			//can be used for insert as well as update both
			em.merge(obj);
			
			tx.commit();
		}
		finally {
			emf.close();
		}
	}

	public Object fetchById(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			//find method generates select query where pk = ?
			Object obj = em.find(clazz, pk);
			return obj;	
		}
		finally {
			emf.close();
		}
	}
	
	public void delete(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			//find method generates select query where pk = ?
			Object obj = em.find(clazz, pk);
			em.remove(obj); //remove will generate delete query
			
			tx.commit();
		}
		finally {
			emf.close();
		}
		
	}
}
