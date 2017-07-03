package pl.com.sages.spring.bootcamp.service;

import pl.com.sages.spring.bootcamp.model.Product;

import java.util.List;

public class PaymentService {

    public void pay(List<Product> productList) {
        System.out.println("Płacę za: " + productList);
    }

}
