package com.UserManagement.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Customer",schema = "jpa")
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CustomerId;
	
	@Column(name="CustomerName")
	private String CustomerName;
	
	@OneToMany(mappedBy = "customer")
	private List<PhoneNumber> phoneNumber;
	
	

}
