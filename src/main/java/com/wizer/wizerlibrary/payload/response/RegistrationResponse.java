package com.wizer.wizerlibrary.payload.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wizer.wizerlibrary.models.users.UserEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RegistrationResponse implements Serializable{

    @ApiModelProperty(notes = "User's Id")
    private Long userId;

    @ApiModelProperty(notes = "First Name")
    private String firstName;

    @ApiModelProperty(notes = "Last Name")
    private String lastName;

    @ApiModelProperty(notes = "Email")
    private String email;

//    private String phoneNumber; //todo: for later

    @JsonIgnore
    private boolean isActive = true;

    @ApiModelProperty(notes = "User's Address")
    private AddressResponse address;

    public static RegistrationResponse build(UserEntity user){
        return new RegistrationResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.isActive(),
                new AddressResponse(user.getAddress().getAddresss())
        );
    }

}
