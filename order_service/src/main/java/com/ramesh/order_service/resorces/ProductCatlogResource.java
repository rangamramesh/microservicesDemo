package com.ramesh.order_service.resorces;

import com.ramesh.order_service.models.CatlogItem;
import com.ramesh.order_service.models.Product;
import com.ramesh.order_service.models.ProductList;
import com.ramesh.order_service.models.RatingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/catlog")
public class ProductCatlogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getproducts")
    public List<CatlogItem> getCatlog(){
//        ProductList products= restTemplate.getForObject("http://localhost:8081/products/getProducts", ProductList.class);
        ProductList products= restTemplate.getForObject("http://product-service/products/getProducts", ProductList.class);
        List<Product> products1=products.getProductList();
        List<CatlogItem> response=new ArrayList<>();
        for (Product product:products1){
//            RatingList ratings = restTemplate.getForObject("http://localhost:8083/ratings/get/" + product.getProductId(), RatingList.class);
            RatingList ratings = restTemplate.getForObject("http://product-rating-service/ratings/get/" + product.getProductId(), RatingList.class);
            response.add(new CatlogItem(product,ratings.getRatingList()));
        }
       return response;
    }
}
