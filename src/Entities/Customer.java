package Entities;

import java.time.LocalDate;
import Abstract.IEntity;

public class Customer {
	 private int id;
	 private String firstName;
	 private String lastName;
	 private LocalDate dateOfBirth;
	 private long nationalId;
	
	public Customer() {
		
	}
	
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, long nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public long getNationalId() {
		return nationalId;
	}


	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}
	
}
