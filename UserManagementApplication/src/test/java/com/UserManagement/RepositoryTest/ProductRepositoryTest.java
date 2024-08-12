package com.UserManagement.RepositoryTest;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.UserManagement.Model.Product;
import com.UserManagement.Repository.ProductRepository;

@SpringBootTest
public class ProductRepositoryTest {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Test
	public void findByName()
	{
		List<Product> listOfProduct=productRepo.findByName("Airpods");
		//Or we can use for each
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+listOfProduct.get(0).getProductDescription());
	}
	
	@Test
	public void findByNameAndPrice()
	{
		List<Product> listOfProduct=productRepo.findByNameAndPrice("Itunes", 200D);
		//Or we can use for each
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+listOfProduct.get(0).getProductDescription());
	}
	
	@Test
	public void findByPriceGreaterThan()
	{
		List<Product> productList=productRepo.findByPriceGreaterThan(100D);
		productList.forEach(e->System.out.println(e.getProductDescription()));
	}
	
	@Test
	public void findByProductDescriptionContaining()
	{	
		//NOTE : ProductDescription a P capital and D capital.
		List<Product> productList=productRepo.findByProductDescriptionContaining("to");
		productList.forEach(e->System.out.println("Hello"+e.getProductDescription()));
	}
	
	@Test
	public void findByPriceBetween()
	{
		List<Product> productList=productRepo.findByPriceBetween(70D,160D);
		productList.forEach(e->System.out.println("Hello"+e.getProductDescription()));
	}
	
	@Test
	public void findByProductDescriptionLike()
	{
		List<Product> productList=productRepo.findByProductDescriptionLike("__pen____"); // Or (%pen%)
		productList.forEach(e->System.out.println("Hello"+e.getProductDescription()));
	}
//	
//	@Test
//	public void findByPriceIn()
//	{
//		
//	//	List<Double> ll = Arrays.asList(Double.valueOf(50), Double.valueOf(150));
//		List<Product> productList=productRepo.findByIdIn(Arrays.asList(1L,3L));
//		productList.forEach(e->System.out.println("Hello"+e.getProductDescription()));
//	}
//	
	

}
