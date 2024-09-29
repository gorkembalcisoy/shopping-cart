package com.ecommerce.shoppingcart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        while(true){
            System.out.println("SHOPPING CARD APP STARTED");
            Thread.sleep(5000);
        }
    }
}
