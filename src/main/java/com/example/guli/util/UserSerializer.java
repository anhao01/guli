package com.example.guli.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author : xuz
 * @date : 2021/8/24 20:59
 */
public class UserSerializer extends JsonSerializer<Long> {
  @Override
  public void serialize(Long userId, JsonGenerator jsonGenerator, SerializerProvider provider)
      throws IOException {
    jsonGenerator.writeObject(userId);

    if (userId == null || "0".equals(userId.toString())) {
      return;
    }

    String filedName = jsonGenerator.getOutputContext().getCurrentName();

    //    CacheChannel cacheChannel = SpringContextUtil.getBean(CacheChannel.class);
    //    CacheObject cacheObject = cacheChannel.get("sys_user_name", userId + "");

    String realName = "";
    //    if (cacheObject.getValue() != null) {
    //      realName = ((String) cacheObject.getValue());
    //    } else {
    //      realName = SpringContextUtil.getBean(UserService.class).queryRealNameByUserId(userId);
    //    }

    // 生成_name后缀格式的用户名
    jsonGenerator.writeStringField(filedName.replaceAll("Id$", "") + "Name", realName);
  }
}
