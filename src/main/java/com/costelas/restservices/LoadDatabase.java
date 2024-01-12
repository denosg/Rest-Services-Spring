package com.costelas.restservices;

import com.costelas.restservices.models.User;
import com.costelas.restservices.models.UserStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new User("denis", "costelasdenis@gmail.com", 10, UserStatus.INACTIVE)));
            log.info("Preloading " + repository.save(new User("casian", "costelascasian@gmail.com", 0, UserStatus.ACTIVE)));
        };
    }
}