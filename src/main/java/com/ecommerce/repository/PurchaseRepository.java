package com.ecommerce.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Purchase;

@Repository
public class PurchaseRepository {

	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	class PurchaseRowMapper implements RowMapper<Purchase>{

		@Override
		public Purchase mapRow(ResultSet rs, int rowNum) throws SQLException {
			Purchase p = new Purchase();
			p.setId(rs.getInt(1));
			p.setProd_name(rs.getString(2));
			p.setProd_price(rs.getString(3));
			p.setCategory(rs.getString(4));
			p.setPurchase_date(rs.getDate(5));
			return p;
		}
	
		
	}
	
	public List<Purchase> findAll(){
		return template.query("select * from purchase", new PurchaseRowMapper());
	}
	public List<Purchase> findbyfilter(String cat, Date date){ 
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    String strDate= formatter.format(date);  
		return template.query("select * from purchase where category='"+cat+"' "
				+ "and purchase_date='"+strDate+"' ", new PurchaseRowMapper());
	}
	
}
