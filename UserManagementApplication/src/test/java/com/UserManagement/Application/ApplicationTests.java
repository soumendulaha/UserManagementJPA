package com.UserManagement.Application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.UserManagement.Model.Product;
import com.UserManagement.Repository.ProductRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	public ProductRepository productRepo;

	@Test
	void contextLoads() {
	}

	// Writing a simple test case for Product entity

	@Test
	public void createProduct() {
		List<Product> prouctList = new ArrayList<>();
		Product product1 = new Product(1L, "IPhone", "Expensive", 50D);
		Product product2 = new Product(2L, "IPad", "This is an Ipad",100D);
		Product product3 = new Product(3L, "Airpods", "This is an airpod",150D);
		Product product4 = new Product(4L, "Itunes", "Subscribed to Itunes",200D);

		// productRepo.save(product);
		prouctList.add(product1);
		prouctList.add(product2);
		prouctList.add(product3);
		prouctList.add(product4);

		productRepo.saveAll(prouctList);

	}

	// @Test
	public void getProduct() {
		Product product = productRepo.findById(1L).get();
		assertEquals("IPhone", product.getName());
		assertNotNull(product);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + product.getProductDescription());
	}

	// Note : To update the product, I have commented out the rest of the test
	// cases.
//	@Test
	public void updateProduct() {
		Product product = productRepo.findById(1L).get();
		product.setProductDescription("Too expensive");
		productRepo.save(product);
	}

//	@Test
	public void deleteProduct() {
		productRepo.deleteById(1L);
	}

//	@Test
	public void checkExists() {
		assertEquals(true, productRepo.existsById(1L));
	}

//	@Test
	public void checkCount() {
		assertEquals(1, productRepo.count());
	}

}
