package app;



import antlr.collections.List;
import dao.CustomerAddressDao7;
import entity.Address6;
import entity.Customer5;

public class AddCustomerAndAddress8 {

	public static void main(String[] args) {
		CustomerAddressDao7 dao = new CustomerAddressDao7();
		
		// what should we change in this following commented code to print 'address id' 
		// in the table of customer ,lets find out after the commented line
		
		/*Customer5 c = new Customer5();
		//c.setId(1);
		c.setName("Majrul");
		c.setEmail("majrul@gmail");
		dao.add(c);
		
		Address6 a = new Address6();
		a.setPincode(400001);
		a.setCity("Mumbai");
		a.setState("Maharashtra");
		dao.add(a);*/
		
		
		
		/*Customer5 c = dao.fetchCustomer(2);
		Address6 a = dao.fetchAddress(2);
		
		c.setAddress(a); // coz of this line now the 'addr_id' now show some value...if this line is not written then it will show null value as in above code
						 // now we link the customer with the address coz of this line
	    
		dao.update(c); // after link the customer with address we now update the table in the database and 'dao' is the database code 
	    */
		
		
		/*Customer5 c1 = new Customer5();
		//c1.setId(200);
		c1.setName("devi");
		c1.setEmail("devi@gmail");
		//dao.add(c1);
		
		Address6 a1 = new Address6();
		a1.setPincode(400002);
		a1.setCity("Mumbai");
		a1.setState("Maharashtra");
		
		c1.setAddress(a1);
		
		dao.add(c1);*/
		
		
		/*Customer5 c = new Customer5();
		c.setName("Mohini");
		c.setEmail("mohini@outlook");
		
		Address6 a = new Address6();
		a.setPincode(411027);
		a.setCity("Pune");
		a.setState("Maharashtra");

		c.setAddress(a);
		
		dao.add(c);*/
		
		//java.util.List<Customer5> list = dao.fetchCustomersByEmail("gmail");
		
		//java.util.List<Customer5> list = dao.fetchCustomersByEmail("outlook");
		
		/*java.util.List<Customer5> list = dao.fetchCustomersByCity("Pune");
				for(Customer5 c : list)
					System.out.println(c.getId() + " " + c.getName() + " " + c.getEmail());
				*/
		
		
				Address6 a = dao.fetchAddressByCustomerName("devi");
				System.out.println(a.getId() + " " + a.getCity() + " " + a.getPincode() + " " + a.getState());
				
		
		
		// i want to cascading effect in the program i.e. if i enter the customer data then automatically the address of the customer data get it, and for that in hinernate we have 'casacade property'
		// and we write cascading effect in 'Customer5' program
		
		
		/*Customer5 c = dao.fetchCustomer(1);
		Address6 a = dao.fetchAddress(1);
		
		c.setAddress(a);
		dao.update(c);*/
		
		
	}
}

