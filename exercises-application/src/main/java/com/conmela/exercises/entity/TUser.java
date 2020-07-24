package com.conmela.exercises.entity;


import java.util.Date;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * (TUser)实体类
 *
 * @author ysq
 * @since 2020/07/24
 */
@Data
@Entity
@Table(name = "t_User")
public class TUser {
    /**
     * ${pk.comment}
     */
    @Id
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
