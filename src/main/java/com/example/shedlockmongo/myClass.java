package com.example.shedlockmongo;

import com.mongodb.MongoClient;
import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.mongo.MongoLockProvider;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myClass {

    @Bean
    public LockProvider lockProvider(MongoClient mongoClient) {
        return new MongoLockProvider(mongoClient, "ShedLockDB");
    }






}
