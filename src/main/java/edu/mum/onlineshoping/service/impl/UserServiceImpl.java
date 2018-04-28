package edu.mum.onlineshoping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.onlineshoping.model.Customer;
import edu.mum.onlineshoping.repository.UserRepository;
import edu.mum.onlineshoping.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
		customer.getUser().setPassword(encoder.encode(customer.getUser().getPassword()));
		userRepository.save(customer);
		return customer;
	}
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void edit(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Customer findOneWithName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
