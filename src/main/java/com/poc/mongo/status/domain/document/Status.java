package com.poc.mongo.status.domain.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("Status")
public class Status {

    @Id
    private ObjectId id;

    private String partnerId;

    private String partnerCode;

    private TransitionStatus transitionStatus;

    private SimCard chipEquipment;

    private Equipment badEquipment;

    private Equipment goodEquipment;

    private Technician technician;



}
