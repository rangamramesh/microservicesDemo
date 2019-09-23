package com.ramesh.product_rating._service.models;

public class Rating {
    private String productId;
    private int rating;
    private String comment;

    public Rating(String productId, int rating, String comment) {
        this.productId = productId;
        this.rating = rating;
        this.comment = comment;
    }

    public Rating() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
