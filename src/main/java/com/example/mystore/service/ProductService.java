package com.example.mystore.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mystore.model.Product;
import com.example.mystore.repo.ProductRepository;
import com.example.mystore.view.ProductDetailView;
import com.example.mystore.view.ProductView;

@Service
public class ProductService {
	@Autowired 
	private ProductRepository productRepository;

	public List<ProductView> listAll() {
		List<Product> products = new ArrayList<Product>();
		List<ProductView> productList = new ArrayList<ProductView>();
		
		try {
			products = productRepository.findAll();
			
			if (!(products == null)) {
				for(Product product : products ) {
					productList.add(new ProductView(product.getpBaseProduct(), product.getpVenue()));
				}
			}
		}
		catch(Exception e) {
			throw new RuntimeException("Fail to get the product list!!! - " + e.getMessage());
		}
		
		return productList;
	}
	
	public Product getAidByBaseProduct(BigInteger pBaseProduct) {
		Product product = new Product();

		try {
			product = productRepository.findByPBaseProduct(pBaseProduct);
		}
		catch(Exception e) {
			throw new RuntimeException("Fail to get the product by P_BASE_PRODUCT!!! - " + e.getMessage());
		}

		return product;
	}
	
	public ProductView getByBaseProduct(BigInteger pBaseProduct) {
		ProductView productView = new ProductView();
		Product product = new Product();
		
		try {
			product = getAidByBaseProduct(pBaseProduct);
	
			if (!(product == null)) {
					productView.setId(product.getpBaseProduct());
					productView.setName(product.getpVenue());
				}
		}	
		catch(Exception e) {
			throw new RuntimeException("Fail to get the product by P_BASE_PRODUCT!!! - " + e.getMessage());
		}
		return productView;
	}

	public ProductDetailView getByBaseProductDetail(BigInteger pBaseProduct) {
		ProductDetailView productDetailView = new ProductDetailView();
		Product product = new Product();

		try {
			product = getAidByBaseProduct(pBaseProduct);
					
			if (!(product == null)) {
					productDetailView.setId(product.getpBaseProduct());
					productDetailView.setName(product.getpVenue());
					productDetailView.setDate(product.getpDate());
				}
		}	
		catch(Exception e) {
			throw new RuntimeException("Fail to get the product by P_BASE_PRODUCT!!! - " + e.getMessage());
		}
		return productDetailView;
	}
	
	public List<ProductView> getLikePVenue(String pVenue) {
		List<ProductView> productDetailView = new ArrayList<ProductView>();
		List<Product> products = new ArrayList<Product>();
		
		try {
			products = productRepository.findByPVenueContaining(pVenue);
			if (!(products == null)) {
				for(Product product : products) {
					productDetailView.add(new ProductView(product.getpBaseProduct(), product.getpVenue()));
				}
			}
		}
		catch(Exception e) {
			throw new RuntimeException("Fail to get the product by P_VENUE!!! - " + e.getMessage());
		}
		
		return productDetailView;
	}
}
