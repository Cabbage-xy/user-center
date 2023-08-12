package com.cxy.usercenter.constant;

/**
 * 用户常量
 *
 * @auther cxy
 */
public interface UserConstant {
    /**
     * 用户登录态键
     */
    //隐式声明为public static final
    String USER_LOGIN_STATE = "userLoginState";

    // -----------权限--------------
    /**
     * 默认权限
     */
    int DEFAULT_ROLE = 0;

    /**
     * 管理员权限
     */
    int ADMIN_ROLE = 1;
}
