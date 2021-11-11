package com.wizer.wizerlibrary.service;


import com.wizer.wizerlibrary.models.users.enums.ERole;
import com.wizer.wizerlibrary.payload.request.LoginRequest;
import com.wizer.wizerlibrary.payload.request.RegistrationRequest;
import com.wizer.wizerlibrary.payload.response.LoginResponse;
import com.wizer.wizerlibrary.payload.response.RegistrationResponse;

public interface UserService {

    RegistrationResponse registration(RegistrationRequest userRegistrationRequest, ERole eRole);

    LoginResponse login(LoginRequest loginRequest);
}
