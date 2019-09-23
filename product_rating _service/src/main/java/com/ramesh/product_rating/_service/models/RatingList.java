package com.ramesh.product_rating._service.models;

import java.util.List;

public class RatingList {
    List<Rating> ratingList;

    public RatingList() {
    }

    public RatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }
}
