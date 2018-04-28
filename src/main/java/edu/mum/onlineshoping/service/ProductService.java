package edu.mum.onlineshoping.service;

import java.util.List;

import edu.mum.onlineshoping.model.Product;

public interface ProductService {
	public List <Product> getAll();
	public Product getProductById(Long key);
	//public void delete(Long id);
	//public void addProduct(Product product);	
	//public void updateProduct(Long key);
	public void sayHello();
		
	//write by Yaorui
    // get all the products belong to the specified vendor
    public List<Product> findByVendorId(Long vendorId);
    
    // vendor add new product operation
    public Product addProduct(Product product);
    
    //vendor search product operation
    public List<Product> findByProductName(String productName);
    
    // vendor update product operation
    public void updateProduct(Product product);
    
    // vendor delete product operation
    public void deleteProduct(Long ProductId);


}
