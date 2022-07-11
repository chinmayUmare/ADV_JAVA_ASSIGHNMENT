package app;

import java.time.LocalDate;

import antlr.collections.List;
import dao.EmployeeDao3;
import entity.Employee1;
//import entity.Employee1;

public class InsertEmployee2 {

	public static void main(String[] args) {
		
		
		Employee1 emp = new Employee1();
		emp.setEmpno(1005);
		emp.setName("Nisha1");
		emp.setSalary(15000);
		emp.setDateOfJoining(LocalDate.of(2022, 10, 10));
		
		// now here we create 'EmployeeDao3' object and with the help of this we pass Employee1 object 'emp' to the 'add' method 
		// and 'EntityManagerFactory' line to 'tx.begin();' we move this 4 to 5 line to the EmployeeDao class
		EmployeeDao3 dao = new EmployeeDao3();
		dao.add(emp);
		
		
		
		// if i want to make a form in html and get the data from user and store in database then what code should we write
		// and ans is following code, and for this code we make and an html file at frontend and fetch the data by following code
		// and following code is dynamic we get data from user but above code is not dynamic we hardcoded the value in above code
		//instead of 'main' method we write doGet method 
		/*doGet(..){
			Employee1 emp = new Employee1();
			emp.setEmpno(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			emp.setSalary(request.getParameter("salary"));
			emp.setDateOfJoining(request.getParameter("doj"));
			
			EmployeeDao3 dao = new EmployeeDao3();
			dao.add(emp);
		
			out.write("<h1>Record inserted successfully</h1>");
		}*/
		
		
		/*EmployeeDao3 dao = new EmployeeDao3();
		Employee1 emp = dao.fetch(1002);
		System.out.println(emp.getName() + " " + emp.getSalary());
		*/
		
		
		/*EmployeeDao3 dao = new EmployeeDao3();
		java.util.List<Employee1> list = dao.fetchAll();
		for(Employee1 emp : list)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		  */
		
		
		/*System.out.println(".............");
		List list2 = dao.fetchAllBySalary(5000);
		for(Employee1 emp : list2)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		*/	
			
		
		/*System.out.println("..............");
		java.util.List<String> names = dao.fetchAllNames();
		for(String name : names)
			System.out.println(name);
		*/
		
		/*System.out.println("..............");
		java.util.List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalaries();
		for(Object[] arr : namesAndSalaries)
			System.out.println(arr[0] + " " + arr[1]);
		*/
		

	/*public static void main(String[] args) {
		//During this step, the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//we make an object of 'Employee1' to set the value in column which we had created in 'Employee1' class
		Employee1 emp = new Employee1();
		emp.setEmpno(1002);
		emp.setName("dishi");
		emp.setSalary(10000);
		emp.setDateOfJoining(LocalDate.of(2020, 10, 10));
		//we used 'persist' method for insert , and there will be other method in hibernate for delete and update also we just have to learn that
		em.persist(emp); // it will generate insert query , above data we will create and store in 'emp' object and pass to 
						 // 'persist' method , then it will automatically generate the query
		
		tx.commit();
		
		emf.close();
	}*/
		
		
	}

}
