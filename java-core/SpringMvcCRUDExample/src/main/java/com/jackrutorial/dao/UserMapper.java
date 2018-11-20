package com.jackrutorial.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.jackrutorial.model.User;

public class UserMapper implements RowMapper {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		   User user = new User();
		   user.setId(rs.getInt("id"));
		   user.setFirstname(rs.getString("firstname"));
		   user.setLastname(rs.getString("lastname"));
		   user.setAddress(rs.getString("address"));
		   
		   return user;
		  }
		  
		 }
