package edu.mum.onlineshoping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.onlineshoping.model.Vendor;
import edu.mum.onlineshoping.repository.ProductRepository;
import edu.mum.onlineshoping.repository.VendorRepository;
import edu.mum.onlineshoping.service.VendorService;

public class VendorServiceImpl implements VendorService {
	@Autowired
	VendorRepository vendorRepository;
	
//	private final VendorRepository vendorRepository;
//		
//	@Autowired
//	public VendorServiceImpl(VendorRepository vendorRepository) {
//		this.vendorRepository = vendorRepository;
//	}

	@Override
	public Vendor save(Vendor vendor) {		
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor findByVendorId(Long vendorId) {
		return vendorRepository.findOne(vendorId);
	}
	
}
