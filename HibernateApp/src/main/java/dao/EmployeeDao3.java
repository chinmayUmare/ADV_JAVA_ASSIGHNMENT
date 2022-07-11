package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import com.cdac.entity.Employee;

import entity.Employee1;

//now after 'InsertEmployee2' program if i want to add database related code in separate program then 
// i am going to create EmployeeDao class and in this we write database related code and in 'InsertEmployee2' 
// class we create object of this 'EmployeeDa' class
//Data Access Object
//classes which contain database related code
//are commonly referred to as Dao classes
public class EmployeeDao3 {

	public void add(Employee1 emp) {
		//During this step, the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(emp); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	//if i want to pass more than one employee then we just have to make small changes 
	// in above 'add' method
	//Also we used 'List' to add more than one entry of EMployee data
	
	/*public void add(List<Employee1> emp) {
		//During this step, the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		for(Employee1 e : emp) // we write for loop just for add more than one Employee data
			em.persist(e); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}*/
	
	/*public Employee1 fetch(int empno) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where primary key = ?
		// 'find' method get 2 parameter (Name of class, primary key)
		// why name of class, coz table is in 'Employee1' class
		
		Employee1 emp = em.find(Employee1.class, empno);
		
		emf.close();

		return emp;
		
	}*/
	
	public List<Employee1> fetchAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		//if i want to create my own select query with your own 'where' clause and all then 
		// i have to used 'createQuery' method and pass the query that i wanted as parameter
		// and in parameter 'e' is alias for Employee, we should know 'joins' topic from Database 
		// and we used 'e' while calling column i.e. 'e.name'
		
		Query q = em.createQuery("select e from Employee1 e"); //HQL/JPQL
		List<Employee1> list = q.getResultList();
		
		emf.close();

		return list;
	}
	
	
	/*public List<Employee1> fetchAllBySalary(double salary) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e from Employee e where e.salary >= :sal");
		
		//'fetchAllBySalary(double salary)' in that method 'salary' is set to "sal" in following line
		q.setParameter("sal", salary);
		List<Employee1> list = q.getResultList();
		
		emf.close();

		return list;
	}*/
	

	public List<String> fetchAllNames() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name from Employee1 e"); //HQL/JPQL
		List<String> list = q.getResultList();
		
		emf.close();

		return list;
	}

	public List<Object[]> fetchAllNamesAndSalaries() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name,e.salary from Employee1 e"); //HQL/JPQL
		List<Object[]> list = q.getResultList();
		
		emf.close();

		return list;
	}
}

