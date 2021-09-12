package com.baomidou.ant.sys.service.impl;

import com.baomidou.ant.sys.entity.User;
import com.baomidou.ant.sys.mapper.UserMapper;
import com.baomidou.ant.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author jobob
 * @since 2021-08-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {}
