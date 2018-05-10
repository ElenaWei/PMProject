package edu.mum.onlineshoping.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.onlineshoping.model.Customer;
import edu.mum.onlineshoping.model.ShoppingCart;

import edu.mum.onlineshoping.service.ShoppingCartService;
import edu.mum.onlineshoping.service.UserService;


@Controller
public class ShoppingCartController {
	@Autowired
	private ShoppingCartService shoppingCartService;

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/cunstomer/cartList", method = RequestMethod.GET)
	public String getCartList(Model model , Principal principal) {
		Customer customer = userService.findOneWithName(principal.getName());
		List<ShoppingCart> shoppingCart = shoppingCartService.getAllByCustomerId(customer.getId());
		model.addAttribute("shoppingCart", shoppingCart);
		double totalPrice = shoppingCartService.findTotalCartCost(shoppingCart);
		model.addAttribute("totalPrice", totalPrice);
		return "cartList";
	}
	@RequestMapping(value = "/addShoppingCart/{productId}", method = RequestMethod.GET)
	public String addCart(@PathVariable Long productId  ,Principal principal) {
		Customer customer = userService.findOneWithName(principal.getName());
		shoppingCartService.saveShoppingCart(productId,customer.getId());
		return "redirect:/cunstomer/cartList";
	}
	@RequestMapping(value = "/removeShoppingCart/{shoppingCartId}", method = RequestMethod.GET)
	public String removeCart(@PathVariable Long shoppingCartId) {
		ShoppingCart shoppingCart = shoppingCartService.getById(shoppingCartId);
		shoppingCart.setProduct(null);
		shoppingCartService.deletShoppingCart(shoppingCart);
		return "redirect:/cunstomer/cartList";
	}
	@RequestMapping(value = "/removeAllShoppingCart", method = RequestMethod.GET)
	public String removeAllCart(Principal principal) {
		Customer customer = userService.findOneWithName(principal.getName());
		List<ShoppingCart> shoppingCart = shoppingCartService.getAllByCustomerId(customer.getId());
		for (ShoppingCart shoppingCart2 : shoppingCart) {
			shoppingCart2.setProduct(null);
			shoppingCartService.deletShoppingCart(shoppingCart2);
		}
		return "redirect:/cunstomer/cartList";
	}
}
