package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	boolean addProduct(Product p);
	boolean updateProduct (Product p);
	boolean deleteProduct (int id);
	
	List<Product> getallProduct();
	List<Product> searchProduct(String data);
	
	Product getById (int id);
	

}
