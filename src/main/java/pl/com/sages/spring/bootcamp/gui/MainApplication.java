package pl.com.sages.spring.bootcamp.gui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.sages.spring.bootcamp.service.ApplicationService;

public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationService applicationService = applicationContext.getBean(ApplicationService.class);
        applicationService.doShopping();

    }

}
