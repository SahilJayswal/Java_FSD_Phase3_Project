package com.ecommerce.entity;

public class Product {

	private int id;
	private String prod_name;
	private String prod_price;
	private String category;
	
	public Product() {
		
	}
	
	public Product(int id, String prod_name, String prod_price, String category) {
		super();
		this.id = id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.category = category;
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
	@Override
	public String toString() {
		return "Product [id=" + id + ", prod_name=" + prod_name + ", prod_price=" + prod_price + ", category="
				+ category + "]";
	}
	
	
}
