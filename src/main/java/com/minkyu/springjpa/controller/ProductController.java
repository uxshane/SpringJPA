package com.minkyu.springjpa.controller;

import com.minkyu.springjpa.data.dto.ProductDTO;
import com.minkyu.springjpa.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-api")
public class ProductController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{productId}")
    public ProductDTO getProduct(@PathVariable("productId") String productId) {

        long startTime = System.currentTimeMillis();

        ProductDTO productDTO = productService.getProduct(productId);

        LOGGER.info("[Find Product] : productId = {}, productName = {}, in {} ms]",
                productDTO.getProductId(),
                productDTO.getProductName(),
                System.currentTimeMillis() - startTime);

        return productDTO;
    }

    @PostMapping("/product")
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {

        long startTime = System.currentTimeMillis();

        ProductDTO newProduct = productService.saveProduct(productDTO);

        LOGGER.info("[Create Product] : productId = {}, productName = {}, in {} ms]",
                newProduct.getProductId(),
                newProduct.getProductName(),
                System.currentTimeMillis() - startTime);

        return newProduct;
    }

    @GetMapping("/log-test")
    public void printLog() {
        LOGGER.trace("This is a trace message");
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");
    }

}
