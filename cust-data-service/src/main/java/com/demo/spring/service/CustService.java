package com.demo.spring.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.daointerface.*;
import com.hsbc.tr.spring.entity.*;
@Service
public class CustService {
@Autowired
private CustDao dao;

public Cust findById(int custId)
{
	return dao.findById(custId);
	}
public List<Cust> listAll()
{
	ArrayList<Cust> list=new ArrayList<>(dao.listAll());
return list;


}
}
