package edu.mum.onlineshoping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.onlineshoping.model.OrderDetails;
import edu.mum.onlineshoping.repository.OrderDetailsRepository;
import edu.mum.onlineshoping.service.OrderDetailsService;

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	
	public void addOrderDetails(OrderDetails orderDetails) {
		orderDetailsRepository.save(orderDetails);
		
	}

	@Override
	public List<OrderDetails> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails getOrderDetailsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeOrderDetails(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderDetails findByProductId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
