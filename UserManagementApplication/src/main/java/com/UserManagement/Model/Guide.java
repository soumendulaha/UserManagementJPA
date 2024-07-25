package com.UserManagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="guide",schema = "jpa")
public class Guide {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long guideId;
	
	@Column(name="guideName")
	private String guideName;
	
	

}
