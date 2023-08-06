package com.cxy.usercenter.service;
import java.util.Date;

import com.cxy.usercenter.model.domain.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

// import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@ComponentScan("com.cxy.usercenter")
//@MapperScan("com.cxy.usercenter.mapper")
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
//        user.setId(0L);
        user.setUsername("cxycxy");
        user.setUserAccount("cabbage_xy");
        user.setAvatarUrl("http://localhost");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("10086");
        user.setEmail("email@qq.com");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);
        boolean result =  userService.save(user);
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "cxyyy";
        String userPassword = "";
        String checkPassword = "123456";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "cxy";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "c x y";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "cabbage_xy";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        userAccount = "cxyy";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertTrue(result > 0);
    }
}