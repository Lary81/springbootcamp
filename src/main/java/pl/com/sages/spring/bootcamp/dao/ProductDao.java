package pl.com.sages.spring.bootcamp.dao;

import pl.com.sages.spring.bootcamp.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductDao {

    void addProduct(String productName, int price);

    Product getProduct(String name);

    List<Product> findAll();

}
