package com.poc.mongo.status.application.http.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SimCardRequest {

    private String networkOperator;
}
