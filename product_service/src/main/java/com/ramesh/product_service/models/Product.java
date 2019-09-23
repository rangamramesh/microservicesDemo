package com.ramesh.product_service.models;

public class Product {
    private String productName;
    private String category;
    private String productCost;
    private String productId;

    public Product() {
    }

    public Product(String productName, String category, String productCost, String productId) {
        this.productName = productName;
        this.category = category;
        this.productCost = productCost;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductCost() {
        return productCost;
    }

    public void setProductCost(String productCost) {
        this.productCost = productCost;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
