package com.cxy.usercenter.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cxy.usercenter.model.domain.User;
import com.cxy.usercenter.service.UserService;
import com.cxy.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 92127
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-08-04 21:19:08
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
