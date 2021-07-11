package com.ecommerce.entity;

import java.util.Date;

public class Purchase {
	
	private int id;
	private String prod_name;
	private String prod_price;
	private String category;
	private Date purchase_date;
	
	public Purchase() {
		
	}
	
	public Purchase(int id, String prod_name, String prod_price, String category, Date purchase_date) {
		super();
		this.id = id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.category = category;
		this.purchase_date = purchase_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_price() {
		return prod_price;
	}
	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", prod_name=" + prod_name + ", prod_price=" + prod_price + ", category="
				+ category + ", purchase_date=" + purchase_date + "]";
	} 
	
	
	

}
