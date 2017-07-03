package pl.com.sages.spring.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.com.sages.spring.bootcamp.dao.ProductDao;
import pl.com.sages.spring.bootcamp.model.Product;

@Component
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product getProduct(String name) {
        return productDao.getProduct(name);
    }

}
