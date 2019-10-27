package com.example.demo;

import com.example.demo.services.Quoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        context.getBeansOfType(Quoter.class).values().forEach(quoter -> {
            System.out.println(quoter.getClass());
            quoter.sayQuote();
        });
    }

}
