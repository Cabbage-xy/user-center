package com.cxy.usercenter.service;
import java.util.Date;

import com.cxy.usercenter.model.domain.User;
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
}