package com.poc.mongo.status.service;

import com.poc.mongo.status.application.http.request.TransitionRequest;
import com.poc.mongo.status.domain.PostStatusService;
import com.poc.mongo.status.mapping.StatusMapper;
import com.poc.mongo.status.repository.PostStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.poc.mongo.status.domain.document.Status;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostStatusServiceImpl implements PostStatusService {

    @Autowired
    private StatusMapper statusMapper;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private PostStatusRepository postStatusRepository;

    @Transactional
    public void process(TransitionRequest transitionRequest) {
        Status status = statusMapper.requestToStatus(transitionRequest);
//        postStatusRepository.insert(status);
        mongoTemplate.insert(status);
    }
}
