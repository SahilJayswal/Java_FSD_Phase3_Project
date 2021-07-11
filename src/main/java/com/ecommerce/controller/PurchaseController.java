package com.ecommerce.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.entity.Purchase;
import com.ecommerce.repository.PurchaseRepository;


@Controller
public class PurchaseController {
	
	@Autowired
	PurchaseRepository purchaseRepository;

	@RequestMapping(value = "/purchase", method = RequestMethod.GET)
	public String purchase(Model map) {
		List<Purchase> list = purchaseRepository.findAll();
		map.addAttribute("list", list);
		return "purchase";
		
	}
	
	
	@RequestMapping(value = "/filter", method = RequestMethod.POST)
	public String purchaseFilter(Model map, @RequestParam String cat, @RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date) {
		List<Purchase> list = purchaseRepository.findbyfilter(cat, date);
		map.addAttribute("list", list);
		return "purchase";
    }
		
		
		
	}
	

