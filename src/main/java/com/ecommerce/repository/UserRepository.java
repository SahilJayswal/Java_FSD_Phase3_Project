package com.ecommerce.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.User;

@Repository
public class UserRepository {
	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	public List<User> findAll(){
//		return jdbcTemplate.query("select * from user", 
//				new BeanPropertyRowMapper(User.class));
//	}
	
	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<User> findAll() {
	
	return template.query("select * from user", new RowMapper<User>() {
		public User mapRow(ResultSet rs, int row) throws SQLException {
			User e = new User();
			e.setId(rs.getInt(1));
			e.setUser_id(rs.getString(2));
			e.setEmail_id(rs.getString(3));
			return e;
		}
	});
}
	public List<User> findbyname(String name) {
		
		String name1 = name.toLowerCase();
		return template.query("select * from user where user_id='"+name1+"'", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User e = new User();
				e.setId(rs.getInt(1));
				e.setUser_id(rs.getString(2));
				e.setEmail_id(rs.getString(3));
				return e;
			}
		});
	}
}

