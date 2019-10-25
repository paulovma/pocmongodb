package com.poc.mongo.status.application.http.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TransitionStatusRequest {

    private String code;

    private String changeAgent;

    private LocalDateTime updatedAt;

    private String reason;
}
