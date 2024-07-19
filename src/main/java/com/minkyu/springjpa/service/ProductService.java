package com.minkyu.springjpa.service;

import com.minkyu.springjpa.data.dao.impl.ProductDAOImpl;
import com.minkyu.springjpa.data.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ProductService {

    ProductDTO saveProduct(ProductDTO productDTO);

    ProductDTO getProduct(String productId);

}
