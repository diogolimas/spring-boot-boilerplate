package com.chamado.service.chamado;

import com.chamado.model.Chamado;
import com.chamado.model.dto.ChamadoRegistrationRequest;
import com.chamado.model.dto.ChamadoRegistrationResponse;

public interface ChamadoService {

    Chamado findByCodigo(Long codigo);
    ChamadoRegistrationResponse registration(ChamadoRegistrationRequest dto);

}
