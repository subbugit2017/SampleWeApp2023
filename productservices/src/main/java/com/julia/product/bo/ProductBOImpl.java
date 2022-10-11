package com.julia.product.bo;

import com.julia.product.dao.ProductDAO;
import com.julia.product.dao.ProductDAOImpl;
import com.julia.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
