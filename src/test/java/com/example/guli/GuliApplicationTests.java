package com.example.guli;

import com.example.guli.dao.UserDao;
import com.example.guli.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootTest
public class GuliApplicationTests {
  @Autowired private UserDao userDao;

  @Test
  void contextLoads() {
    List<UserEntity> userList = userDao.selectList(null);
    userList.forEach(System.out::println);
  }

  @Test
  void testInsert() {
    UserEntity user = new UserEntity();
    user.setName("张三");
    user.setAge(18);
    user.setEmail("55317332@qq.com");
    int result = userDao.insert(user);
    System.out.println(result); // 影响的行数
    System.out.println(user); // id自动回填
  }

  @Test
  void TestTime() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("现在时间" + localDateTime);
    LocalDateTime localDateTime1 = LocalDateTime.of(2020, Month.SEPTEMBER, 10, 12, 12, 12);
    System.out.println("设定时间" + localDateTime1);
    localDateTime1 = localDateTime1.plusYears(1);
    System.out.println(localDateTime1);
  }

  @Test
  void testOptimisticLocker() {
    UserEntity userEntity = userDao.selectById(11L);
    userEntity.setAge(24);
    userDao.updateById(userEntity);
  }
}
