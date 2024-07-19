package com.minkyu.springjpa.data.dao;

import com.minkyu.springjpa.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);

}
