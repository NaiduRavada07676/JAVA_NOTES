package com.example.jbdl95redis.model;


import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable {

    private String  id;
    private String name;
    private Integer age;
    private Gender gender;
    private Date createdOn;
    private Date updatedOn;
}

//sbsdr -> sbs + sdr + driver
//db -> driver + jpa + hibernate

//2 kinds of driver
//1. Lettuce
//2. Jedis