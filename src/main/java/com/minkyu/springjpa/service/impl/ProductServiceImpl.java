package com.minkyu.springjpa.service.impl;

import com.minkyu.springjpa.data.dao.impl.ProductDAOImpl;
import com.minkyu.springjpa.data.dto.ProductDTO;
import com.minkyu.springjpa.entity.ProductEntity;
import com.minkyu.springjpa.handler.ProductDataHandler;
import com.minkyu.springjpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDataHandler productDataHandler;

    public ProductServiceImpl(ProductDataHandler productDataHandler) {
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        return productDataHandler.saveProductEntity(productDTO).convertToProductDTO();
    }

    @Override
    public ProductDTO getProduct(String productId) {
        return productDataHandler.getProductEntity(productId).convertToProductDTO();
    }

}
