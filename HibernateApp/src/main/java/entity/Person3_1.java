package entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_person")
public class Person3_1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String email;
	private LocalDate dateOfBirth;
	
	//we don't write FK in 'Person' class but also we write object of 'Passport3_2' in 'Person' class also so 
	//we write 'mappedBy' in @OneToOne to tell that we don't put passport number in Person class as FK, but we put 
	//'person id' in 'Passport' class so thats why in 'Passport' class we write @JoinColumn
	// 'mappedBy = "person" ahe so, it tells that mapping 'Passport3_2' class mdhe jithe mi 'person' ha object create kela ahe, coz FK apn ''Passport3_2' ya mdhe thvnr aho 
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport3_2 passport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Passport3_2 getPassport() {
		return passport;
	}

	public void setPassport(Passport3_2 passport) {
		this.passport = passport;
	}

}
