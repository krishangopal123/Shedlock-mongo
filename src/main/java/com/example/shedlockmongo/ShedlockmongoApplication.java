package com.example.shedlockmongo;


import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.TimeZone;

@SpringBootApplication
@EnableMongoAuditing
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "PT30S")


public class ShedlockmongoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShedlockmongoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ShedlockmongoApplication.class, args);

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        LOGGER.info("Welcome");
    }


}
