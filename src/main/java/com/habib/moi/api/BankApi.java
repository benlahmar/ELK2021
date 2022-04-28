package com.habib.moi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.habib.moi.dao.IBank;
import com.habib.moi.models.Bank;

@RestController
public class BankApi {

	@Autowired
	IBank brepo;
	@GetMapping("banks/{id}")
	public Bank getbyid(@PathVariable String id)
	{
		return 
		brepo.findById(id).get();
	}
}
