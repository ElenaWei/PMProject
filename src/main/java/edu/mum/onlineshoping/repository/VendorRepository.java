package edu.mum.onlineshoping.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.mum.onlineshoping.model.Vendor;


@Repository
public interface VendorRepository extends CrudRepository<Vendor, Long>{
	
}
