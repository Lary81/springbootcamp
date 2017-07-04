package pl.com.sages.spring.bootcamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.com.sages.spring.bootcamp.dao.ProductDao;
import pl.com.sages.spring.bootcamp.dao.ProductDaoImpl;
import pl.com.sages.spring.bootcamp.service.ApplicationService;

import java.util.HashMap;

@Configuration
@PropertySource(value = "classpath:params.properties", encoding = "UTF-8")
@ComponentScan("pl.com.sages.spring.bootcamp")
public class Spring {

    @Bean
    public ApplicationService createApplicationService() {
        ApplicationService applicationService = new ApplicationService();
//        applicationService.setApplicationName("Kodołamacz Bootcamp");
        return applicationService;
    }

    @Bean
    public ProductDao getProductDao() {
        ProductDaoImpl productDao = new ProductDaoImpl(new HashMap<>());
        productDao.addProduct("konewka", 10);
        productDao.addProduct("szpadel", 100);
        productDao.addProduct("taczki", 150);
        productDao.addProduct("kosiarka", 1500);
        return productDao;
    }

}
