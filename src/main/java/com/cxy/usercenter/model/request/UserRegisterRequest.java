package com.cxy.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author cxy
 */
//lombok注解data，自动生成getter、setter
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -964552087257072212L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

}
