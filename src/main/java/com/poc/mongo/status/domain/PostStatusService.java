package com.poc.mongo.status.domain;

import com.poc.mongo.status.application.http.request.TransitionRequest;

public interface PostStatusService {

    void process(TransitionRequest transitionRequest);
}
