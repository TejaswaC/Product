package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;

@Service("productService")
@Transactional(propagation=Propagation.SUPPORTS)
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	@Override
	public String insertProduct(Product product) {
		System.out.println("servicce ke andar");
		// TODO Auto-generated method stub
		return productDAO.insertProduct(product);
	}

}
