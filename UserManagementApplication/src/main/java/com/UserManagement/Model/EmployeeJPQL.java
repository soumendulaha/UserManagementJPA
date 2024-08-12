package com.UserManagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employee",schema ="jpa" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeJPQL {
	
	@Column(name="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long employeeId;
	
	@Column(name="fName")
	String firstName;
	
	@Column(name="lName")
	String lastName;
	
	
}
