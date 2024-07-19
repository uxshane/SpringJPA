package com.minkyu.springjpa.data.dao.impl;

import com.minkyu.springjpa.data.dao.ProductDAO;
import com.minkyu.springjpa.entity.ProductEntity;
import com.minkyu.springjpa.repository.ProductRepository;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        return productRepository.findById(productId).orElse(null);
    }
}
