package com.poc.mongo.status.repository;

import com.poc.mongo.status.domain.document.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostStatusRepository extends MongoRepository<Status, String> {
}
