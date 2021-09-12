package com.example.guli.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * 用户表
 *
 * @author xuz
 */
@Data
@TableName("user")
public class UserEntity extends BaseEntity {
  /** 主键id */
  @TableId(type = IdType.AUTO)
  private Long id;
  /** 用户名 */
  private String name;
  /** 年龄 */
  private Integer age;
  /** 邮箱 */
  private String email;
  /** 版本号 */
  @Version
  @TableField(fill = FieldFill.INSERT)
  private Integer version;
}
