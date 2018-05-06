package com.example.mystore.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mystore.service.ProductService;
import com.example.mystore.view.ProductDetailView;
import com.example.mystore.view.ProductView;

@Controller
public class WebStoreController {
	@Autowired
	ProductService productService;
	
	
 @RequestMapping(value = "/", method = RequestMethod.GET  )
 public String index(Map<String, Object> view) {
    	
    	List<ProductView> productList = new ArrayList<ProductView>();
    	
    	productList = productService.listAll();
    	
    	view.put("productList", productList);
        return "index";
    }

	 @RequestMapping(value = "/", method = RequestMethod.POST  )
	 public String search(Map<String, Object> model, @RequestParam("p_venue") String pVenue) {
	 	
    	List<ProductView> productList = new ArrayList<ProductView>();
	 	
    	productList = productService.getLikePVenue(pVenue);
	 	
	 	model.put("productList", productList);
	     return "index";
	 }

    @RequestMapping(value = "/product/detail/{p_base_product}", method = RequestMethod.GET  )
    public String detail(Map<String, Object> model, @PathVariable("p_base_product") BigInteger pBaseProduct) {
    	
    	ProductDetailView productDetail = new ProductDetailView();
    	
    	productDetail = productService.getByBaseProductDetail(pBaseProduct);
    	
    	model.put("productDetail", productDetail);
        return "detail";
    }

    /*
    @RequestMapping(value = "/product/search/{p_venue}", method = RequestMethod.GET  )
    public String search(Map<String, Object> model, @PathVariable("p_venue") String pVenue) {
    	
    	Product productDetail = new Product();
    	
    	productDetail = productService.getByPVenue(pVenue);
    	
    	model.put("productDetail", productDetail);
        return "detail";
    }
*/
}
