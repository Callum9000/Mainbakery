package com.example.demo.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class AccountConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            AccountRepository repository){
        return args->{
            Account mariam = new Account(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    "mariam.address",
                    false
            );
            Account alex = new Account(
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
