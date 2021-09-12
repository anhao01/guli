package com.example.guli.util;

import com.baomidou.ant.sys.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Locale;

/**
 * @author : xuz
 * @date : 2021/8/24 20:57
 */
public class SpringContextUtil implements ApplicationContextAware {
  private static ApplicationContext context = null;

  public static <T> T getBean(Class<UserService> beanName) {
    return (T) context.getBean(beanName);
  }

  public static String getMessage(String key) {
    return context.getMessage(key, null, Locale.getDefault());
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    SpringContextUtil.context = applicationContext;
  }
}
