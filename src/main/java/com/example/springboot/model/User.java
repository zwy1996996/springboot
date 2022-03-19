package com.example.springboot.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/3/19 16:16
 */
@Entity(name = "t_user")
@Data
public class User implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String sex;

    @Transient
    private String lover;
}
