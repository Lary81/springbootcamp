package pl.com.sages.spring.bootcamp.dao;

import pl.com.sages.spring.bootcamp.model.Product;

import java.util.List;

public interface ProductDao {

    void addProduct(String name, int price);

    Product findProduct(int id);

    Product findProduct(String name);

    List<Product> findAll();

}
