package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;

@Controller
public class ProductController {

	
	@RequestMapping(value= "/manage")
	public String home() {
		return "manage";
	}
	
	@RequestMapping(value= "/add")
	public String add() {
		return "addproduct";
	}
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping(value= "/sport")
	public String findSport(Model map) {
		List<Product> list = productRepository.findSport();
		map.addAttribute("list", list);
		return "managecategory";
	}
	
	@RequestMapping(value= "/casual")
	public String findCasual(Model map) {
		List<Product> list = productRepository.findCasual();
		map.addAttribute("list", list);
		return "managecategory";
	}
	@RequestMapping(value= "/formal")
	public String findFormal(Model map) {
		List<Product> list = productRepository.findFormal();
		map.addAttribute("list", list);
		return "managecategory";
	}
	@RequestMapping(value= "/addproduct", method = RequestMethod.POST)
	public String addProduct(@RequestParam String name,@RequestParam String price, @RequestParam String cat) {
		productRepository.insert(new Product(name, price, cat));
		return "success";
	}
	@RequestMapping(value= "/deleteproduct", method = RequestMethod.POST)
	public String delete(@RequestParam String id){
		if(id!=null) {
		productRepository.deleteById(id);
		return "success";
		}
		return "error";
	}
	@RequestMapping(value= "/delete")
	public String deletepage(){
		return "delete";
	}
}
