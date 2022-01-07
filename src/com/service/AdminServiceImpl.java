package com.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DB;
import com.model.Admin;

public class AdminServiceImpl implements AdminService{

	@Override
	public boolean addAdmin(Admin ad) {
		
		String sql = "insert into admin(fname, lname, dob, address, username, password ) values (?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setString(1, ad.getFname());
			pstm.setString(2, ad.getLname());
			pstm.setDate(3, ad.getDob());
			pstm.setString(4, ad.getAddress());
			pstm.setString(5, ad.getUsername());
			pstm.setString(6, ad.getPassword());
			
			pstm.execute();
			return true;
			
			
			
		
		
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return false;
	}

	

	
	
	
	
	
	
	
}
