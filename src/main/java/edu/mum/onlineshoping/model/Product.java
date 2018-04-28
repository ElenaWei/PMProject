package edu.mum.onlineshoping.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;


@Entity
public class Product {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotEmpty(message="Not empty!")
	private String name;
	@NotNull(message="Not null!")
	private double unitPrice;
	@NotEmpty
	private String description;
	@NotNull
	private int unitsInStock;	
	private boolean discount = true;
	@NotEmpty(message="Not empoty!")
	private String conditioned;
	@OneToOne
	private Category category;
	/*@OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Review> reviews;*/
	@Transient
	private MultipartFile image;
	
	//write by Elena
    @ManyToOne
    private Vendor vendor;   
    private boolean enable;
	
	public MultipartFile getImage() {
		return image;
	}
	public void setProductImage(MultipartFile image) {
		this.image = image;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setConditioned(String conditioned) {
		this.conditioned = conditioned;
	}
	public String getName() {
		return name;
	}
	public void setpName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	public boolean isDiscount() {
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	public String getConditioned() {
		return conditioned;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	/*public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}*/
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
}
