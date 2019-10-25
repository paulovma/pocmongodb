package com.poc.mongo.status.mapping;

import com.poc.mongo.status.application.http.request.TransitionRequest;
import com.poc.mongo.status.domain.document.Status;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface StatusMapper {

    @Mappings({
        @Mapping(target = "id", ignore = true),
    })
    Status requestToStatus(TransitionRequest transitionRequest);
}
