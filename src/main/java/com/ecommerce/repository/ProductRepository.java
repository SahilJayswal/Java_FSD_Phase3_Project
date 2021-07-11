package com.ecommerce.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.ecommerce.entity.Product;


@Repository
@Transactional
public class ProductRepository {
	
 
	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	class ProductRowMapper implements RowMapper<Product>{

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product p = new Product();
			p.setId(rs.getInt(1));
			p.setProd_name(rs.getString(2));
			p.setProd_price(rs.getString(3));
			p.setCategory(rs.getString(4));
			return p;
		}
		
	}
	public List<Product> findSport(){
		return template.query("select * from product where category='Sport Shoes'", new ProductRowMapper());
	}
	
	public List<Product> findCasual(){
		return template.query("select * from product where category='Casual Shoes'", new ProductRowMapper());
	}
	
	public List<Product> findFormal(){
		return template.query("select * from product where category='Formal Shoes'", new ProductRowMapper());
	}
	@PersistenceContext
	EntityManager entityManager;
	
	public Product insert(Product product) {
		return entityManager.merge(product);
	}
	
	public Product findById(int id) {
		return entityManager.find(Product.class, id);
	}
	
	
	 public void deleteById(String id) {
		 int id1 = Integer.parseInt(id); 
		 Product product = findById(id1); 
		 entityManager.remove(product); 
	 }
	 
	/*
	 * public void deleteById(String id) {
	 * template.update("delete from product where id="+id+"", new
	 * ProductRowMapper()); }
	 */
	
	
	
	
}



