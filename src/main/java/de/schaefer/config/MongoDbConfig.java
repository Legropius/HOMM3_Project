package de.schaefer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoDbConfig extends AbstractMongoConfiguration {
  
    @Override
    protected String getDatabaseName() {
        return "homm3";
    }
  
    @Override
    public MongoClient mongoClient() {
        return new MongoClient("127.0.0.1", 27017);
    }
}