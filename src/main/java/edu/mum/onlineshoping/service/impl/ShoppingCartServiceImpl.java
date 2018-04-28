package edu.mum.onlineshoping.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.onlineshoping.model.OrderDetails;
import edu.mum.onlineshoping.model.Product;
import edu.mum.onlineshoping.model.ShoppingCart;
import edu.mum.onlineshoping.repository.OrderDetailsRepository;
import edu.mum.onlineshoping.repository.ProductRepository;
import edu.mum.onlineshoping.repository.ShoppingCartRepository;
import edu.mum.onlineshoping.service.ShoppingCartService;


@Service
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired 
	ShoppingCartRepository shoppingCartRepository;
	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	@Autowired
	ProductRepository productRepository;
	
 
	public ShoppingCart getById(Long Id) {
		 
		return shoppingCartRepository.findOne(Id);
		 
	}


	@Override
	public List<ShoppingCart> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void saveShoppingCart(Long productId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deletShoppingCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ShoppingCart findByTotalPrice() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ShoppingCart findByOrderId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deletAllCart() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double findTotalCartCost(List<ShoppingCart> shoppingCarts) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	 
}
