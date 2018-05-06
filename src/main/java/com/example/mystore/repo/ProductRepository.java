package com.example.mystore.repo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mystore.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	Product findByPBaseProduct(@Param("pBaseProduct") BigInteger pbaseproduct);

	Product findByPVenue(@Param("pVenue") String pvenue);
	
	List<Product> findByPVenueContaining(@Param("pVenue") String pvenue);
}
