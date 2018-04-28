package edu.mum.onlineshoping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.mum.onlineshoping.model.Product;

@Repository
public interface ProductRepository extends  CrudRepository<Product, Long>{

	//write by Yaorui
	@Query("select p from Product p where p.vendor.id = :vendorId")
    List<Product> findByVendorId(@Param("vendorId")Long vendorId);
    @Query("select p from Product p where p.name like %:productName%")
    List<Product> findByProductName(@Param("productName")String productName);	
	
}
