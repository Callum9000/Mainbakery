package com.example.demo.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ProductRepository repository){
        return args->{
            Product mariam = new Product(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    "mariam.address",
                    false
            );
            Product alex = new Product(
                    "Alex",
                    "alex@gmail.com",
                    "Alex.address",
                    false
            );
            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
