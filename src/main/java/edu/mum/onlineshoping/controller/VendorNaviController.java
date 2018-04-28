package edu.mum.onlineshoping.controller;

import java.io.IOException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.onlineshoping.model.Category;
import edu.mum.onlineshoping.model.Product;
import edu.mum.onlineshoping.service.ProductService;


@Controller("/vendor")
@RequestMapping("/vendor")
public class VendorNaviController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/profile")
	public String editVendorProfile(){
		
		return "vendor/profile";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "vendor/register";
	}
	
	@GetMapping("/products")
	public String showProducts(Model model){		
		//model.addAttribute("products", productService.findByVendorId(vendorId));
		return "vendor/productList";
	}

	@GetMapping("/product/add")
	public ModelAndView addingProducts() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("vendor/addproduct");
		return mv;
	}
		
	@PostMapping("/product/add")
	public ModelAndView addProducts(@RequestParam("pName") String pName,
			@RequestParam("unitPrice") double unitPrice,
			@RequestParam("description") String description,
			@RequestParam("unitsInStock") int unitsInStock,
			@RequestParam("category") Category category,
			@RequestParam("image") MultipartFile image){
		
		Product p = new Product();
		p.setpName(pName);;
		p.setUnitPrice(unitPrice);
		p.setDescription(description);
		p.setUnitsInStock(unitsInStock);
		p.setCategory(category);
		p.setEnable(true);
		//p.setVendor(vendor);
		byte[] imageBase64;
		String base64Encoded="";
        try {
        	imageBase64 = Base64.encodeBase64(image.getBytes());
			base64Encoded = new String(imageBase64, "UTF-8");
			//p.setProductImage(base64Encoded);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		p = productService.addProduct(p);
		ModelAndView mv = new ModelAndView();
		mv.addObject("p", p);
		mv.setViewName("vendor/productList");
		return mv;
	}
	
	
	@RequestMapping("/addProduct")
	public String addProduct(){
		return "vendor/addProduct";
	}
	
	@RequestMapping("/updateProduct")
	public String updateProduct() {
		return "vendor/updateProduct";
	}
}
