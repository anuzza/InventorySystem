package com.service;

import java.util.List;

import com.model.Cashier;


public interface CashierService {
	
	boolean addCashier(Cashier c);
	boolean updateCashier(Cashier c);
	boolean deleteCashier(int id);
	
	Cashier getById(int id);
	
	List<Cashier> getAllCashier();
	
	

}
