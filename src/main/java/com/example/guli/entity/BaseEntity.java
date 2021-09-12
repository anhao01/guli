package com.example.guli.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author xuz
 * @date 20210820
 */
@Data
public class BaseEntity {
  /** 创建人id */
  @TableField(value = "create_user_id", fill = FieldFill.INSERT)
  private Long createUserId;
  /** 创建时间 */
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  @JsonFormat(pattern = "yyyy/MMM/dd HH:mm:dd", timezone = "GMT+8")
  private LocalDateTime createTime;
  /** 更新人id */
  @TableField(value = "update_user_id", fill = FieldFill.INSERT_UPDATE)
  private Long updateUserId;
  /** 更新时间 */
  @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
  @JsonFormat(pattern = "yyyy/MMM/dd HH:mm:dd", timezone = "GMT+8")
  private LocalDateTime updateTime;
}
