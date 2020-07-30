package com.conmela.exercises.user.service.dto;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (TUserDTO)实体映射类
 *
 * @author ysq
 * @since 2020/07/28
 */
@Data
@ApiModel("TUserDTO")
public class TUserDTO implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;


    @ApiModelProperty("")
    private Integer roles;


    @ApiModelProperty("")
    private Integer dept;


    @ApiModelProperty("")
    private String idCard;


    @ApiModelProperty("")
    private String email;


    @ApiModelProperty("")
    private String phone;


    @ApiModelProperty("")
    private String gender;


    @ApiModelProperty("")
    private String avatarName;


    @ApiModelProperty("")
    private String avatarPath;


    @ApiModelProperty("")
    private String password;


    @ApiModelProperty("")
    private Date pwdResetTime;

}
