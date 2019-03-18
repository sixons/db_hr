package com.sanqing.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestUser {
    private Long id;
    private String name;
    private Integer age;
    private Byte sex;
    private Date createDate;
    private String address;
}
