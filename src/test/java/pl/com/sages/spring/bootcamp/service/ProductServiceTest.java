package pl.com.sages.spring.bootcamp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.com.sages.spring.bootcamp.dao.ProductDao;
import pl.com.sages.spring.bootcamp.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void should_find_all_products() throws Exception {
        //given
        jdbcTemplate.execute("TRUNCATE product");
        productDao.addProduct("konewka",123);
        productDao.addProduct("konewka2",123);
        productDao.addProduct("konewka3",123);

        // when
        List<Product> products = productService.findAllProducts();

        // then
        assertThat(products).isNotEmpty();
        assertThat(products.size()).isEqualTo(3);
    }

}