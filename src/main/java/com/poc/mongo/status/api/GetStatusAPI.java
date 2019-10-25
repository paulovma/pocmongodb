package com.poc.mongo.status.api;

import com.poc.mongo.status.domain.GetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetStatusAPI {

    @Autowired
    private GetStatusService getStatusService;

    @GetMapping("/status/{partnerId}")
    void getStatus(@PathVariable String partnerId) {
        getStatusService.getStatus(partnerId);
    }
}
