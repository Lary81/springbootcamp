package pl.com.sages.spring.bootcamp.dao;

import org.springframework.stereotype.Repository;
import pl.com.sages.spring.bootcamp.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao {

    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public void addProduct(String productName, int price) {
        productMap.put(productName, new Product(productName, price));
    }

    @Override
    public Product getProduct(String name) {
        return productMap.get(name);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

}
