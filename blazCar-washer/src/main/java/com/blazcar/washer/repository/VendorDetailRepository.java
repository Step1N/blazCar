package com.blazcar.washer.repository;

import com.blazcar.washer.domain.VendorDetail;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@EnableMongoAuditing
@Repository
public interface VendorDetailRepository extends MongoRepository<VendorDetail, String>{

}
