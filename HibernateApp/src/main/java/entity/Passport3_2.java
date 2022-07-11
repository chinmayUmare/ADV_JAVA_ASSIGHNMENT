package entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_passport")
public class Passport3_2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passportNo;
	
	private LocalDate issueDate;
	private LocalDate expiryDate;
	private String issuedBy;
	
	@OneToOne
	@JoinColumn(name = "pers_id")
	private Person3_1 person;

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public Person3_1 getPerson() {
		return person;
	}

	public void setPerson(Person3_1 person) {
		this.person = person;
	}
	
}

