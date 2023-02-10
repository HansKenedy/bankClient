package com.proyecto01.client.web.mapper;


import com.proyecto01.client.domain.Client;
import com.proyecto01.client.web.model.ClientModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    Client modelToEntity (ClientModel model);

    ClientModel entityToModel (Client event);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Client entity, Client updateEntity);
}
