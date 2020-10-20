package com.demo.spring.dao.impl;
import com.hsbc.tr.spring.entity.*;
import com.demo.spring.data.*;
import com.demo.spring.service.*;
import com.demo.spring.JdbcConfig;
import com.demo.spring.daointerface.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class CustomerDaoJdbcImpl implements CustDao  {


@Autowired
JdbcTemplate jt;
@Override
public  Cust findById(int id)
{
 Cust customer=jt.queryForObject("select * from CUSTOMERS where custId="+id,new RowMapper<Cust>()
		 {
	 public  Cust mapRow(ResultSet rs,int rowNum) throws SQLException
	 {
		 return new Cust(rs.getInt(1),rs.getString(2),rs.getInt(3));
	 }
		 });
 return customer;

}
@Override
public List<Cust> listAll()
{
	List<Cust> custlist =jt.query("select * from CUSTOMERS",new RowMapper<Cust>() {
		public Cust	mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Cust(rs.getInt(1),rs.getString(2),rs.getInt(3));
			
		}
		
	});
	return custlist;
}
	

}
