package entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// we configure all the points in 'persistence.xml' file now for coding point of view 
//we need to create a java class which will be mapped to some table in the database

// just imagine that you have to make a table name called 'tbl_emp' of Employee
//and have four column of it and we declared it by annotation and here Employee is
// is a class name and all the data member is declared as column
@Entity
@Table(name = "tbl_emp")
public class Employee1 {

	@Id //primary key
	@Column(name = "empno")
	private int empno;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "date_of_joining")
	private LocalDate dateOfJoining;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}
