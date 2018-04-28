package edu.mum.onlineshoping.service;

import edu.mum.onlineshoping.model.Vendor;

public interface VendorService {
	public Vendor save(Vendor vendor);
	public Vendor findByVendorId(Long vendorId);
}
