package com.chamado.service.chamado;

import com.chamado.model.*;
import com.chamado.model.dto.ChamadoRegistrationRequest;
import com.chamado.model.dto.ChamadoRegistrationResponse;
import com.chamado.model.mapper.ChamadoMapper;
import com.chamado.repository.ChamadoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class ChamadoServiceImpl implements ChamadoService{

    private final ChamadoRepository chamadoRepository;
    @Override
    public Chamado findByCodigo(Long codigo) {

        Chamado probe = new Chamado();

        probe.setId(codigo);

        Example<Chamado> example = Example.of(probe);

        return chamadoRepository.findBy(example, FluentQuery.FetchableFluentQuery::first).orElseThrow();
    }


    public ChamadoRegistrationResponse registration(ChamadoRegistrationRequest dto) {

        final Chamado chamado = ChamadoMapper.INSTANCE.convertToChamado(dto);

        chamadoRepository.save(chamado);

        log.info("{} registered successfully -> com o código::: ", chamado.getId().toString());

        return ChamadoMapper.INSTANCE.convertToChamadoResponse(chamado);
    }
}
