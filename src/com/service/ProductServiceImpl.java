package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Cashier;
import com.model.Product;


public class ProductServiceImpl implements ProductService{

	@Override
	public boolean addProduct(Product p) {
		
		String sql = "insert into product(name,available,added,mrp)values(?,?,?,?)";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setString(1, p.getName());
			pstm.setInt(2, p.getAvailable());
			pstm.setInt(3, p.getAdded());
			pstm.setInt(4, p.getMrp());
			
			pstm.execute();
			return true;
			
			
		
		
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		
		
		String sql = "update product set name=?,available=?,added=?,mrp=? where id = ?";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setString(1, p.getName());
			pstm.setInt(2, p.getAvailable());
			pstm.setInt(3, p.getAdded());
			pstm.setInt(4, p.getMrp());
			pstm.setInt(5, p.getId());
			
			pstm.execute();
			return true;
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		


		
		return false;
	}

	@Override
	public List<Product> getallProduct() {
		
		List<Product> plist = new ArrayList<>();
		
		String sql = "select * from product";
		
		try {
			Statement stm = DB.getConnection().createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while( rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setAvailable(rs.getInt("available"));
				p.setAdded(rs.getInt("added"));
				p.setMrp(rs.getInt("mrp"));
				
				
				plist.add(p);
				
				
				
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return plist;
	}

	@Override
	public Product getById(int id) {
		
		Product p = new Product();
		
		String sql = "select * from product where id = " + id;
		
		try {
			Statement stm = DB.getConnection().createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			
			if (rs.next()) {
				
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setAvailable(rs.getInt("available"));
				p.setAdded(rs.getInt("added"));
				p.setMrp(rs.getInt("mrp"));
				
				
				
				
				
				
				
				
			}
		
		
		
		
		
		
		
		
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return p;
		
		
		
		
		
		
	}

	@Override
	public boolean deleteProduct(int id) {
		
		
		String sql= "delete from product where id = "+id ;
		try {
			Statement stm = DB.getConnection().createStatement();
		    stm.execute(sql);
		    return true;
		    
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
	}

	@Override
	public List<Product> searchProduct(String data) {
		
		 List<Product> plist= new ArrayList<>();
			
			String sql = "select id,name,available,mrp from product where name like '%"+data+"%' OR id like '%"+data+"%'   ";
			
			try {
				Statement stm = DB.getConnection().createStatement();
			    ResultSet rs = stm.executeQuery(sql);
			    
			    while( rs.next()) {
			    	Product p = new Product();
			    	p.setId(rs.getInt("id"));
			    	p.setName(rs.getString("name"));
			    	p.setAvailable(rs.getInt("available"));
			    	p.setMrp(rs.getInt("mrp"));
			    	
			    				    	
			    	plist.add(p);
			    	
			    
			    	
			    }
			   
			    
			
			
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			
			
			return plist;
			
		
		
		
	}
	
	
}
	
	
	
	
	
	


