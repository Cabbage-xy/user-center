package com.cxy.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxy.usercenter.model.domain.User;
import com.cxy.usercenter.service.UserService;
import com.cxy.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @auther cxy
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        // 1.校验

        return 0;
    }
}
