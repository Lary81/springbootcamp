package pl.com.sages.spring.bootcamp.dao;

import pl.com.sages.spring.bootcamp.model.Product;

public interface ProductDao {

    void addProduct(String productName, int price);

    Product getProduct(String name);

}
