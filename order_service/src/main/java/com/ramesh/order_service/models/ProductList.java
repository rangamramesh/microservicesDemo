package com.ramesh.order_service.models;

import java.util.List;

public class ProductList {
    List<Product> productList;

    public ProductList() {
    }

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
