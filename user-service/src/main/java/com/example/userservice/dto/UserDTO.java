package com.example.userservice.dto;

import com.example.userservice.vo.ResponseOrder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDTO {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createAt;

    private String encryptPwd;

    private List<ResponseOrder> orders;
}
