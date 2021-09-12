package com.example.guli.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.guli.dao.UserDao;
import com.example.guli.entity.UserEntity;
import com.example.guli.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author jobob
 * @since 2021-08-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {
  @Override
  public String queryRealNameByUserId(Long id) {
    return this.getById(id).getName();
  }
}
