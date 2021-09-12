package com.example.guli.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.guli.entity.UserEntity;

/**
 * 服务类
 *
 * @author jobob
 * @since 2021-08-21
 */
public interface UserService extends IService<UserEntity> {
  /**
   * 根据用户id获取用户名
   *
   * @param id
   * @return
   */
  String queryRealNameByUserId(Long id);
}
