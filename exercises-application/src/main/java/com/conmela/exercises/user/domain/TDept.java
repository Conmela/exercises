package com.conmela.exercises.user.domain;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.Date;

/**
 * (TDept)实体类
 *
 * @author ysq
 * @since 2020/07/28
 */
@Data
@Entity
@Table(name = "tDept")
public class TDept {

    @Id
    private Integer id;


    private String avatarName;


    private String avatarPath;


    private Integer dept;


    private String email;


    private String gender;


    private String idCard;


    private String password;


    private String phone;


    private Date pwdResetTime;


    private Integer roles;

}
