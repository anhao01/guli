package com.baomidou.ant.sys.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @author jobob
 * @since 2021-08-21
 */
@Data
@EqualsAndHashCode()
@ApiModel(value = "User对象", description = "")
public class User {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "姓名")
  private String name;

  @ApiModelProperty(value = "年龄")
  private Integer age;

  @ApiModelProperty(value = "邮箱")
  private String email;

  @ApiModelProperty(value = "创建人id")
  private Long createUserId;

  @ApiModelProperty(value = "创建时间")
  private LocalDateTime createTime;

  @ApiModelProperty(value = "更新人id")
  private Long updateUserId;

  @ApiModelProperty(value = "更新时间")
  private LocalDateTime updateTime;

  @ApiModelProperty(value = "版本号")
  private Integer version;
}
