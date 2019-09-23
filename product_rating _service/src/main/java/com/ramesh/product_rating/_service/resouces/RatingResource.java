package com.ramesh.product_rating._service.resouces;

import com.ramesh.product_rating._service.models.Rating;
import com.ramesh.product_rating._service.models.RatingList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
    @RequestMapping("{productId}")
    public Rating getRating(@PathVariable("productId") int productId){
   return new Rating("10",9,"This product is awesome and this is size adjustable");
    }

    @RequestMapping("get/{productId}")
    public RatingList getRatings(@PathVariable("productId") int productId){
        List<Rating> ratings=Arrays.asList(
                new Rating("1",9,"Best at price"),
                new Rating("1",3,"Best at price"),
                new Rating("1",1,"Do not waste your money and time by buying ths product"),
                new Rating("1",4,"Best at price but Quality is not good"),
                new Rating("1",7,"Best at price and Quality some what good"),
                new Rating("1",8,"Best at price"),
                new Rating("1",9,"Best at price"),
                new Rating("1",10,"Best at price")
        );
   return new RatingList(ratings);
    }
}
