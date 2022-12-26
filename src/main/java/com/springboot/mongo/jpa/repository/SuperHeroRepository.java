package com.springboot.mongo.jpa.repository;

import com.springboot.mongo.jpa.model.SuperHero;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SuperHeroRepository extends MongoRepository<SuperHero, String> {

}
