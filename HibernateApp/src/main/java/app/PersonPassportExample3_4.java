package app;

import java.time.LocalDate;
import java.util.List;

import dao.PersonPassportDao3_3;
import entity.Passport3_2;
import entity.Person3_1;

public class PersonPassportExample3_4 {

	public static void main(String[] args) {
		PersonPassportDao3_3 dao = new PersonPassportDao3_3();
		
		/*Person3_1 p = new Person3_1();
		p.setName("Swapnil");
		p.setEmail("swapnil@gmail.com");
		p.setDateOfBirth(LocalDate.of(1999, 5, 15));
		
		Passport3_2 ps = new Passport3_2();
		ps.setIssueDate(LocalDate.of(2020, 10, 30));	
		ps.setExpiryDate(LocalDate.of(2030, 10, 30));
		ps.setIssuedBy("Govt. of India");
		
		// linking with Passport and Person.
		// we make object of 'Person' and 'passport' , in Customer problem we just pass 'Address' object to the 'Customer' object by setAddress method, coz we have only 'Address' object
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);
		*/
		
		
		/*Person p = dao.fetchPersonByPassportNo(3);
		System.out.println(p.getName() + " " + p.getEmail());*/
		
		List<Person3_1> list = dao.fetchPersonsByPassportExpiryYear(2030);
		for(Person3_1 p : list)
			System.out.println(p.getName() + " " + p.getEmail());
	}
}
