package com.chamado.model.mapper;

import com.chamado.model.Chamado;
import com.chamado.model.dto.ChamadoRegistrationRequest;
import com.chamado.model.dto.ChamadoRegistrationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChamadoMapper {

    ChamadoMapper INSTANCE = Mappers.getMapper(ChamadoMapper.class);

    Chamado convertToChamado(ChamadoRegistrationRequest dto);

    ChamadoRegistrationResponse convertToChamadoResponse(Chamado dto);

}
