package com.ramesh.order_service.models;

import java.util.List;

public class CatlogItem {
    private Product product;
    private List<Rating> ratings;

    public CatlogItem() {
    }

    public CatlogItem(Product product, List<Rating> ratings) {
        this.product = product;
        this.ratings = ratings;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
