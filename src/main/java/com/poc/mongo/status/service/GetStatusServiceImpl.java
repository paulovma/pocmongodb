package com.poc.mongo.status.service;

import com.poc.mongo.status.domain.GetStatusService;
import com.poc.mongo.status.domain.document.Status;
import com.poc.mongo.status.repository.GetStatusRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


@Service
public class GetStatusServiceImpl implements GetStatusService {

    @Autowired
    private GetStatusRepository getStatusRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void getStatus(String partnerId) {
        //just to show that is possible querying data through these two ways
        getStatusRepository.findByPartnerId(partnerId);
        mongoTemplate.find(Query.query(Criteria.where("partnerId").is(partnerId)), Status.class);
    }
}
