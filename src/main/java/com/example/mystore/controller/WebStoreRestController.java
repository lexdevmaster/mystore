package com.example.mystore.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mystore.service.ProductService;
import com.example.mystore.view.ProductView;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class WebStoreRestController {
	
	@Autowired ProductService productService;
	
	 @RequestMapping(value = "/product/list", method = RequestMethod.GET, produces = "application/json"  )
	 @ResponseBody
	 public List<ProductView> productList() {
	    	
	    	List<ProductView> productList = productService.listAll();
	    	
	        return productList;
		 
	    }
	
	 @RequestMapping(value = "/product/by-id/{p_base_product}", method = RequestMethod.GET, produces = "application/json"  )
	 public ProductView productListById(@PathVariable("p_base_product") BigInteger pBaseProduct) {
	    	
	    	ProductView productList = new ProductView();
	    	
	    	productList = productService.getByBaseProduct(pBaseProduct);
	    	
	        return productList;
	    }
}
