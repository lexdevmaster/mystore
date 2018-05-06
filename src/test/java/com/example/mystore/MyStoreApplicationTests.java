package com.example.mystore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mystore.service.ProductService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyStoreApplicationTests {
	
	@Autowired
	ProductService productService;
	
	@Test
	public void testProductTableLength() {
        int lengthExpected = 5;
        Boolean expected = true;

        assertEquals(expected,(this.productService.listAll().size() > lengthExpected));
	}

	@Test
	public void contextLoads() {
		
	}

}
