package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Login;
import com.cts.product.bean.Product;
import com.cts.product.service.LoginService;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	@RequestMapping("AddProduct.html")
	public String getProductPage(){
		return "AddProduct";
	}
	
	
	
	
	@RequestMapping(value="AddProduct.html", method= RequestMethod.POST)						//PostMapping(value="login.html", method= RequestMethod.GET)
	public ModelAndView insertProduct(@ModelAttribute Product product){
		ModelAndView modelAndView = new ModelAndView();
		System.out.print(product);
		productService.insertProduct(product);
			modelAndView.setViewName("admin");
		return modelAndView;
	}
	
	
}
