package com.poc.mongo.status.domain.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Equipment {

    private String serial;

    private EquipmentModel equipmentModel;
}
