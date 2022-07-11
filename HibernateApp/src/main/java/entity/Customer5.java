package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tbl_cust1")
public class Customer5 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // P.K. are auto generated rehna chahiye
	@Column(name = "cust_id")
	private int id;
	
	// do not read the @column unnecessarily if column name and data member name is same
	private String name;
	private String email;

	//NO NO NO NO NO NO
	//we will never keep the FK column as part of the class structure
	//private int addrId;
	
	// we write 'cascade' property in following line and we write 'CascadeType.PERSIST' means if we insert customer, the hibernate insert address automatically, but it will not happened if i
	// delete and update customer then hibernate will not delete and update the address of customer coz we write 'CascadeType.PERSIST' not 'CascadeType.MERGE' OR'CascadeType.
	@OneToOne(cascade = CascadeType.PERSIST)  // for one to one relationship coz one person have only one address
	@JoinColumn(name = "addr_id") //fk
	private Address6 address; //has-a relationship --> for ex --> one class have object of another class, we used Table Address cha 'addr_id' column as a FK in Customer Table, so thats why we make object of 'Address'
							  ////but why it is not showing in database table coz we did not set the address of the table
	
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

	public Address6 getAddress() {
		return address;
	}

	public void setAddress(Address6 address) {
		this.address = address;
	}

}

