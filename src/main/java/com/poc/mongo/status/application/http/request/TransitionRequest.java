package com.poc.mongo.status.application.http.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TransitionRequest {

    private String partnerId;

    private String partnerCode;

    private TransitionStatusRequest transitionStatus;

    private SimCardRequest chipEquipment;

    private EquipmentRequest badEquipment;

    private EquipmentRequest goodEquipment;

    private TechnicianRequest technician;



}
