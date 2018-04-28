package edu.mum.onlineshoping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import edu.mum.onlineshoping.model.Customer;
import edu.mum.onlineshoping.model.Role;
import edu.mum.onlineshoping.model.ShoppingCart;
import edu.mum.onlineshoping.service.ShoppingCartService;
import edu.mum.onlineshoping.service.UserService;

@Controller
public class ShoppingCartController {
	@Autowired
	private ShoppingCartService shoppingCartService;
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/cartList", method = RequestMethod.GET)
	public String getCartList(Model model) {
		List<ShoppingCart> shoppingCart = shoppingCartService.getAll();
		System.out.println("shoppingCart size" + shoppingCart.size());
		model.addAttribute("shoppingCart", shoppingCart);
		double totalPrice = shoppingCartService.findTotalCartCost(shoppingCart);
		model.addAttribute("totalPrice", totalPrice);
		return "shoppingCart/cartList";
	}

}
