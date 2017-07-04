package pl.com.sages.spring.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.sages.spring.bootcamp.dao.ProductDao;
import pl.com.sages.spring.bootcamp.model.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product getProduct(String name) {
        return productDao.getProduct(name);
    }

    public List<Product> findAllProducts() {
        List<Product> products = productDao.findAll();
        return products;
    }
}
