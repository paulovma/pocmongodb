package com.poc.mongo.status.api;

import com.poc.mongo.status.application.http.request.TransitionRequest;
import com.poc.mongo.status.domain.PostStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostStatusAPI {

    @Autowired
    private PostStatusService postStatusService;

    @PostMapping(value = "/status")
    ResponseEntity<Boolean> postStatus(@RequestBody final TransitionRequest transitionRequest) {
        postStatusService.process(transitionRequest);
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }


}
