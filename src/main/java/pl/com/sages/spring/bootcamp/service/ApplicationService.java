package pl.com.sages.spring.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.com.sages.spring.bootcamp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ApplicationService {

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @Autowired
    private PaymentService paymentService;

    private String applicationName;

    public void doShopping() {
        System.out.println("Application name: " + applicationName);

        Product product1 = productService.getProduct("konewka");
        Product product2 = productService.getProduct("szpadel");
        Product product3 = productService.getProduct("kosiarka");
        Product product4 = productService.getProduct("taczki");

        List<Product> productList = new ArrayList<>(4);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        cartService.addToCart(productList);

        paymentService.pay(productList);

        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

}
