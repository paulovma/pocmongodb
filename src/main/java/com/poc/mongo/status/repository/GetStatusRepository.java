package com.poc.mongo.status.repository;

import com.poc.mongo.status.domain.document.Status;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GetStatusRepository extends MongoRepository<Status, String> {

//    @Query(value = "{'partnerId': ?0}")
    List<Status> findByPartnerId(String id);
}
