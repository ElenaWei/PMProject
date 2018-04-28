package edu.mum.onlineshoping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.onlineshoping.model.Product;
import edu.mum.onlineshoping.repository.ProductRepository;
import edu.mum.onlineshoping.service.ProductService;

@Service
@Transactional

public class ProductServiceImpl implements ProductService{
		@Autowired
		ProductRepository productRepository;
		
//    private final ProductRepository productRepository;
//
//    @Autowired
//    public ProductServiceImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
	

	@Override
	public Product getProductById(Long key) {
		return productRepository.findOne(key);
	}

	/*
	@Override
	public void delete(Long id) {
		productRepository.delete(id);
		
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	*/

	@Override
	public List<Product> getAll() {
		
		return (List<Product>) productRepository.findAll();
	}


	/*@Override
	public void updateProduct(Long key) {
		productRepository.updateProduct();
	}*/

	
	public void sayHello(){
		System.out.println("Hello Customer");
	}


	// write by Yaorui
	@Override
	public List<Product> findByVendorId(Long vendorId) {
		return productRepository.findByVendorId(vendorId);
	}


	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}


	@Override
	public List<Product> findByProductName(String productName) {
		return productRepository.findByProductName(productName);
	}


	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
		
	}


	@Override
	public void deleteProduct(Long ProductId) {
		productRepository.delete(ProductId);
	}
}
