package pl.com.sages.spring.bootcamp.dao;

import pl.com.sages.spring.bootcamp.model.Product;

import java.util.Map;

public class ProductDaoImpl implements ProductDao {

    private final Map<String, Product> productMap;

    public ProductDaoImpl(Map<String, Product> productMap) {
        this.productMap = productMap;
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
