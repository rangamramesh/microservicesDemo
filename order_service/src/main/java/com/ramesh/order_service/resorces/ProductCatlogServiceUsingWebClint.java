package com.ramesh.order_service.resorces;

import com.ramesh.order_service.models.CatlogItem;
import com.ramesh.order_service.models.Product;
import com.ramesh.order_service.models.ProductList;
import com.ramesh.order_service.models.RatingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/webclient")
public class ProductCatlogServiceUsingWebClint {

    @Autowired
    private WebClient.Builder getWebClient;

    @RequestMapping("/getproducts")
    public List<CatlogItem> getCatlog(){
      ProductList productList=  getWebClient.build()
                .get()
                .uri("http://localhost:8011/products/getProducts")
                .retrieve()
                .bodyToMono(ProductList.class)
                .block();
        List<Product> products1=productList.getProductList();
        List<CatlogItem> response=new ArrayList<>();
        for (Product product:products1){
            RatingList ratingList=  getWebClient.build()
                    .get()
                    .uri("http://localhost:8012/ratings/get/" + product.getProductId())
                    .retrieve()
                    .bodyToMono(RatingList.class)
                    .block();
            response.add(new CatlogItem(product,ratingList.getRatingList()));
        }
        return response;
    }
}
