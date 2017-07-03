package pl.com.sages.spring.bootcamp.service;

import pl.com.sages.spring.bootcamp.dao.ProductDao;
import pl.com.sages.spring.bootcamp.model.Product;

public class ProductService {

    private ProductDao productDao;

    public Product getProduct(String name) {
        return productDao.getProduct(name);
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

}
