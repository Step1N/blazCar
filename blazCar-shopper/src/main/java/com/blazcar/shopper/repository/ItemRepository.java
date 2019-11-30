package com.blazcar.shopper.repository;

import com.blazcar.shopper.entity.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends MongoRepository<Item, String> {


}
