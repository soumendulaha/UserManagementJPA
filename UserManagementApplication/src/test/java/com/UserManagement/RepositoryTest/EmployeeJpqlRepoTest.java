package com.UserManagement.RepositoryTest;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.UserManagement.Model.EmployeeJPQL;
import com.UserManagement.Repository.EmployeeJpqlRepository;

@SpringBootTest
public class EmployeeJpqlRepoTest {
	
	@Autowired
	private EmployeeJpqlRepository empRepo;

//	@Test
	void findAllEmployee()
	{
		List<EmployeeJPQL> listOfEmployee=empRepo.findAllEmployeeJPQL();
		listOfEmployee.forEach(emp->System.out.println(emp.getFirstName()));
	}
	
//	@Test
	void findFirstNameAndLastNameEmployeeJPL()
	{
		List<Object []> listByFirstNameAndLastName=empRepo.findFirstNameAndLastNameEmployeeJPL();
		for(Object obj []:listByFirstNameAndLastName)
		{
			for(Object object:obj)
			{
				System.out.println(object);
			}
		}
	}
//	@Test
	void findFirstNameAndLastNameEmployeeJPLNotReturningObjectArray()
	{
		List<EmployeeJPQL> listDoesNotReturnObjectArray=empRepo.findFirstNameAndLastNameEmployeeJPLNotReturningObjectArray();
		listDoesNotReturnObjectArray.forEach(e->System.out.println(e.getFirstName()+" Middle "+e.getLastName()));
		
	}
//	@Test
	void findEmployeeSurnameByFirstName()
	{
		EmployeeJPQL emp=empRepo.findEmployeeSurnameByFirstName("neha");
		System.out.println("Hehe kaj korche darun "+emp.getLastName());
	}
	
//	@Test
	@Transactional // DML operation holei @Transactional use korte hobe. Plus eta roll back korbe karon eta junit test
	@Rollback(false) // This we only have to use in Junit test
	void deleteEmployeeByFirstName()
	{
		empRepo.deleteEmployeeByFirstName("soumendu");
	}
	
	@Test
	void EmployeeDataUsingNativeQuery()
	{
		EmployeeJPQL nativeQuery=empRepo.EmployeeDataUsingNativeQuery("dutta laha");
		System.out.println("Native query kaaj korche "+nativeQuery.getFirstName() +" "+nativeQuery.getEmployeeId());
	}
	
	//When to use quoted identifiers?
	
}
	

