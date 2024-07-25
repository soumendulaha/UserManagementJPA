package com.UserManagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="PhoneNumber",schema = "jpa")
@Data
public class PhoneNumber {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PhId;
	
	@Column(name="number")
	private String number;
	
	@Column(name="type")
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
