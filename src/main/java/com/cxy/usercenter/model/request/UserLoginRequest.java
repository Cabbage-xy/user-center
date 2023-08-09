package com.cxy.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;
/**
 * 用户登录请求体
 *
 * @author cxy
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -6367810285571644856L;

    private String userAccount;

    private String userPassword;
}
