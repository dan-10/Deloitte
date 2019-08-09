package com.pms.deloitte.service;

import java.util.List;

import com.pms.deloitte.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct(Product product);
	public Product getProductById(int Id);
	public List<Product> getAllProduct(int productId);
}
