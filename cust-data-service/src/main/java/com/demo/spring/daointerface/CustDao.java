package com.demo.spring.daointerface;
import com.hsbc.tr.spring.entity.*;
import java.util.*;
public interface CustDao {
List<Cust> listAll();
Cust findById(int custId);
}
