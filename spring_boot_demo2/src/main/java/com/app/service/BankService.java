package com.app.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BankDao;
import com.app.model.Bank;

@Service
public class BankService {
	
	@Autowired
	BankDao repository;

	public String savedetails(Bank b) {
		 repository.save(b);
		 return "Success";
	}
	
	
	public void deleteBank(int id) {
		 repository.deleteById(id);
		 //return "Success";
	}
	
	public Bank findBank(String name) {
		return repository.findByName(name);
		 //return "Success";
	}
	
	public java.util.List<Bank> findAllBank() {
		java.util.List<Bank> bank= repository.findAll();
		System.out.println("bank data ="+bank);
		return bank;
	}
}
