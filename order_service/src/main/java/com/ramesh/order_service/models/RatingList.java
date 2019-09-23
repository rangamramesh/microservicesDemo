package com.ramesh.order_service.models;

import java.util.List;

public class RatingList {
    List<Rating> ratingList;

    public RatingList() {
    }

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }
}
