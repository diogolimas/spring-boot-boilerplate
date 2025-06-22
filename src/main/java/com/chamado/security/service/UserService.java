package com.chamado.security.service;

import com.chamado.model.User;
import com.chamado.security.dto.AuthenticatedUserDto;
import com.chamado.security.dto.RegistrationRequest;
import com.chamado.security.dto.RegistrationResponse;

/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
