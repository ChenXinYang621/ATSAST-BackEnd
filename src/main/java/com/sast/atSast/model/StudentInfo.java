package com.sast.atSast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentInfo {
  private long uid;
  private String realName;
  private String stuId;
  private String phone;
  private String faculty;
  private String personId;
  private String major;
  private String qqId;
  private String wxId;
  private Byte enable;
}
