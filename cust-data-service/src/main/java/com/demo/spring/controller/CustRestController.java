package com.demo.spring.controller;
/*
 * @author SHUBHI                           
 */

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.*;
import com.hsbc.tr.spring.entity.*;
import com.demo.spring.service.*;
@RestController
@CrossOrigin
public class CustRestController {

	@Autowired
	CustService serv;

	
	@GetMapping(path = "/cust/find/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity getCustDetails(@PathVariable("id") int id) {
			return ResponseEntity.ok(serv.findById(id));
		
	}

	@GetMapping(path = "/cust", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cust>> listAll() {
    
		return ResponseEntity.ok(serv.listAll());
	}
	
	
	
	
		

}
