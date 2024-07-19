package com.minkyu.springjpa.handler.impl;

import com.minkyu.springjpa.data.dao.ProductDAO;
import com.minkyu.springjpa.data.dto.ProductDTO;
import com.minkyu.springjpa.entity.ProductEntity;
import com.minkyu.springjpa.handler.ProductDataHandler;
import org.springframework.stereotype.Service;

@Service
public class ProductDataHandlerImpl implements ProductDataHandler {

    private final ProductDAO productDAO;

    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductEntity saveProductEntity(ProductDTO productDTO) {
        return productDAO.saveProduct(productDTO.convertToProductEntity());
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }

}
