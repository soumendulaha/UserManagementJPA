package com.UserManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.UserManagement.Model.EmployeeJPQL;

@Repository
public interface EmployeeJpqlRepository extends JpaRepository<EmployeeJPQL, Long> {
	
	//Find all the students using JPQL
	//Note : If we want to select everything from the table, no need to mention "Select All"
		// : If we want to select something partial then only we need to mention "Select bla bla"
	@Query("From EmployeeJPQL")
	List<EmployeeJPQL> findAllEmployeeJPQL();
	
	
	// Select first name and last name of Employee
	//NOTE : When we will retrieve partial data, it will return List of Object array.
	@Query("Select ej.firstName,ej.lastName from EmployeeJPQL ej")
	List<Object[]> findFirstNameAndLastNameEmployeeJPL();
	
	//What if we do not set the return type as object array? Ans: This will throw exception.
	@Query("Select ej.firstName,ej.lastName from EmployeeJPQL ej")
	List<EmployeeJPQL> findFirstNameAndLastNameEmployeeJPLNotReturningObjectArray();
	
	//Now we will use named Query parameter
	@Query("from EmployeeJPQL jp where jp.firstName=:bhaloNaam")
	EmployeeJPQL findEmployeeSurnameByFirstName(@Param("bhaloNaam")String prothomNaam);
	
	//Find list of employees whose salary is between 10k-20k
	//jehetu salary  pojo class a banano nei tai ekn implement korchina.
	
	//Ekhon amra sikhbo non select operation . Jehetu amra data modify korchi (DML) operation , modifying add korte hobe.
	@Modifying
	@Query("DELETE from EmployeeJPQL jp where jp.firstName=:bhaluNaam")
	void deleteEmployeeByFirstName(@Param("bhaluNaam")String prrroooothomNaam);
	
	
	// Now we will learn native query
	@Query(value="Select * from jpa.employee e where e.l_name=:SeshNaam",nativeQuery = true)
	EmployeeJPQL EmployeeDataUsingNativeQuery(@Param("SeshNaam")String lasttttNameee);
	
	//** When to use Quoted identifiers ?
//	Use Quoted Identifiers (if necessary):
//	If your table name includes capital letters or other special characters,
//	you may need to use double quotes around the table name in your query.
	
//	@Query(value = "SELECT * FROM \"Employee\" e WHERE e.l_name = :SeshNaam", nativeQuery = true)
//	EmployeeJPQL EmployeeDataUsingNativeQuery(@Param("SeshNaam") String lasttttNameee);
	
	// Also we can retrive partial data for native query the same way we did earlier.

	

}
