package pl.com.sages.spring.bootcamp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pl.com.sages.spring.bootcamp.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addProduct(String name, int price) {
        jdbcTemplate.update("INSERT INTO product(name, price) VALUES (?,?)", name, price);
    }

    @Override
    public Product findProduct(int id) {
        return null;
    }

    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = jdbcTemplate.query("SELECT * FROM product", new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet resultSet, int i) throws SQLException {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");

                Product product = new Product(id, name, price);

                return product;
            }
        });

        return products;
    }

}