package edu.mum.onlineshoping.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.onlineshoping.model.Product;
import edu.mum.onlineshoping.service.ProductService;
import edu.mum.onlineshoping.service.UserService;



@Controller
public class HomeController  {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ProductService productService;

	@GetMapping({ "/", "/home" })
	public String homePage() {
		return "home";
	}

	@GetMapping({ "/index" })
	public String indexPage() {
		return "index";
	}

	@GetMapping({ "/secure" })
	public String securePage() {
		return "secure";
	}

	@RequestMapping("/user")
	public String toUserPage(HttpServletRequest httpSession) throws Exception {
//	System.out.println(httpSession.getSession().getAttribute("customer"));
//		userService.edit(customer);
		
		return "userPage";
	}

	@RequestMapping("/admin")
	public String toAdminPage() throws Exception {
		return "adminPage";
	}

	@RequestMapping("/login")
	public String toLoginPage() {
		return "login";
	}


	// @Autowired
	// public PersonService personService;
	// @GetMapping({ "/regist" })
	// public ModelAndView toRegistPage() {
	// ModelAndView modelAndView = new ModelAndView("regist");
	// Person person = new Person();
	// modelAndView.addObject(person);
	// return modelAndView;
	// }
	//
	// @RequestMapping("/savePerson")
	// public String saveProductPage(@ModelAttribute(value = "person") Person
	// person) {
	// System.out.println(person);
	// personService.savePerson(person);
	// return "redirect:/login";
	// }
	
	@RequestMapping("/customer/listProduct")
	public String showProductList(Model model) {
		List<Product> products = productService.getAll();
		model.addAttribute("products",products);
		return "listProduct";
	}
	@RequestMapping("/customer/listProduct/search")
	public String searchProductList(String pname, Model model) {
		List<Product> products = productService.findByProductName(pname);
		model.addAttribute("products",products);
		model.addAttribute("pname", pname);
		return "listProduct";
	}

}
