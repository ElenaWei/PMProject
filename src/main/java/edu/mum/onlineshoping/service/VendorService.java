package edu.mum.onlineshoping.service;

import java.util.List;

import edu.mum.onlineshoping.model.Vendor;

public interface VendorService {
	public Vendor save(Vendor vendor);
	public Vendor findByVendorId(Long vendorId);
	public Vendor findByUser_Username(String username);
	public void update(Vendor vendor);
	public List<String> findWeeks(String username);
}
