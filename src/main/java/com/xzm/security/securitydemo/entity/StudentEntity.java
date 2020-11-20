package com.xzm.security.securitydemo.entity;

import lombok.Data;

@Data
public class StudentEntity {
    /**
     * 唯一标识id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}
