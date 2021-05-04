package com.example.userservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createAt;

    private String encryptPwd;
}
