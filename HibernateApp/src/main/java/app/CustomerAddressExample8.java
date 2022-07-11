package app;

import dao.CustomerAddressDao7;
import entity.Address6;
import entity.Customer5;

public class CustomerAddressExample8 {

	public static void main(String[] args) {
		CustomerAddressDao7 dao = new CustomerAddressDao7();
		
		Customer5 c = new Customer5();
		c.setName("Majrul");
		c.setEmail("majrul@gmail");
		dao.add(c);
		
		Address6 a = new Address6();
		a.setPincode(400001);
		a.setCity("Mumbai");
		a.setState("Maharashtra");
		dao.add(a);
		
		/*Customer c = dao.fetchCustomer(1);
		Address a = dao.fetchAddress(1);
		
		c.setAddress(a);
		dao.update(c);*/
		
		/*Customer c = new Customer();
		c.setName("Mohini");
		c.setEmail("mohini@outlook");
		
		Address a = new Address();
		a.setPincode(411027);
		a.setCity("Pune");
		a.setState("Maharashtra");

		c.setAddress(a);
		
		dao.add(c);*/
		
		//List<Customer> list = dao.fetchCustomersByEmail("outlook");
		/*List<Customer> list = dao.fetchCustomersByCity("Pune");
		for(Customer c : list)
			System.out.println(c.getId() + " " + c.getName() + " " + c.getEmail());*/
		
		/*Address6 a = dao.fetchAddressByCustomerName("Mohini");
		System.out.println(a.getId() + " " + a.getCity() + " " + a.getPincode() + " " + a.getState());
		*/
	
	}
}
