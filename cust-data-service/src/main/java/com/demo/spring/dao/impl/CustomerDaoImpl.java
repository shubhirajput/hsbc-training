//package com.demo.spring.dao.impl;
//
//import com.demo.spring.daointerface.*;
//import com.demo.spring.data.*;
//import com.hsbc.tr.spring.entity.*;http://localhost:8081/cust/find/2
//import java.util.*;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class CustomerDaoImpl implements CustDao  {
//@Autowired
// CustDb db;
//
//@Override
//public List<Cust> listAll()
//{
//	ArrayList<Cust> cList=new ArrayList<>(db.getDb().values());
//return cList;
//}
//@Override
//public Cust findById(int custId)
//{
//if(db.getDb().containsKey(custId))
//		{
//	return db.getDb().get(custId);
//		}
//else
//{
//	return null;
//	}
//}
//	
//	
//}
