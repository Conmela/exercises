package com.conmela.exercises.user.domain;


import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;

/**
 * (TUser)实体类
 *
 * @author ysq
 * @since 2020/07/28
 */
@Data
@Entity
@Table(name = "tUser")
public class TUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private Integer roles;


    private Integer dept;


    private String idCard;


    private String email;


    private String phone;


    private String gender;


    private String avatarName;


    private String avatarPath;


    private String password;


    private Date pwdResetTime;

}
