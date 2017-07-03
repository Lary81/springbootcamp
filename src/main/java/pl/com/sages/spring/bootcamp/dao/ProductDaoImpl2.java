package pl.com.sages.spring.bootcamp.dao;

import pl.com.sages.spring.bootcamp.model.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProductDaoImpl2 implements ProductDao {

    private final Map<String, Product> productMap;

    public ProductDaoImpl2() {
        this.productMap = new LinkedHashMap<>();
        addProduct("konewka", 10);
        addProduct("szpadel", 100);
        addProduct("taczki", 150);
        addProduct("kosiarka", 1500);
    }

    @Override
    public void addProduct(String productName, int price) {
        productMap.put(productName, new Product(productName, price));
    }

    @Override
    public Product getProduct(String name) {
        return productMap.get(name);
    }

}
