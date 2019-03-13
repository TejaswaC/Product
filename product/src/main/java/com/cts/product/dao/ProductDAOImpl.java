package com.cts.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Product;

@Repository("productDAO")
@Transactional

public class ProductDAOImpl implements ProductDAO {
	@Autowired

	 private SessionFactory sessionFacotry;

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductById(String uderName, Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Transactional
	public String insertProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = null;
		// TODO Auto-generated method stub
	
			session = sessionFacotry.getCurrentSession();
		
		System.out.println("Inside DAO");

		session.save(product);
		System.out.println("Tupple inserted");
		
		return "Success";

		}
		
		
			
			

	public String deleteProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
