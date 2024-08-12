package com.UserManagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Product",schema = "jpa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="productName")
	private String name;
	
	@Column(name="productDesc")
	private String productDescription;
	
	@Column(name="price")
	private Double price;
}
