package com.minkyu.springjpa.handler;

import com.minkyu.springjpa.data.dto.ProductDTO;
import com.minkyu.springjpa.entity.ProductEntity;
import org.springframework.stereotype.Component;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(ProductDTO productDTO);

    ProductEntity getProductEntity(String productId);

}
