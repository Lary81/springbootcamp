package pl.com.sages.spring.bootcamp.service;

import pl.com.sages.spring.bootcamp.model.Product;

import java.util.List;

public class CartService {

    public void addToCart(List<Product> productList) {
        System.out.println("Dodaje do koszyka: " + productList);
    }

}
