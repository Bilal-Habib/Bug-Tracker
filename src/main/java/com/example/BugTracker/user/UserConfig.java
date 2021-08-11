package com.example.BugTracker.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User Bilal = new User(
                    "Bilal",
                    "Bilal@gmail.com",
                    LocalDate.of(2001, Month.JULY, 7));
            User Chariton = new User(
                    "Chariton",
                    "Chariton@gmail.com",
                    LocalDate.of(1999, Month.AUGUST, 8));
            repository.saveAll(List.of(Bilal, Chariton));
        };
    }

}
