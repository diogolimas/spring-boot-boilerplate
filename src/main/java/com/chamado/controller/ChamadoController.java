package com.chamado.controller;


import com.chamado.model.dto.ChamadoRegistrationRequest;
import com.chamado.model.dto.ChamadoRegistrationResponse;
import com.chamado.security.dto.RegistrationRequest;
import com.chamado.security.dto.RegistrationResponse;
import com.chamado.service.chamado.ChamadoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chamado")
public class ChamadoController {

    private final ChamadoService cS;

    @PostMapping
    @Operation(tags = "Chamado Service", description = "você pode registrar um chamado.")
    public ResponseEntity<ChamadoRegistrationResponse> registrationRequest(@Valid @RequestBody ChamadoRegistrationRequest dto) {

        final ChamadoRegistrationResponse response = cS.registration(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
