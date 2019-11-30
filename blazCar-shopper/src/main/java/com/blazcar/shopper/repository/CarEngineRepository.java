package com.blazcar.shopper.repository;

import com.blazcar.shopper.entity.CarEngine;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarEngineRepository extends MongoRepository<CarEngine, String> {
}
