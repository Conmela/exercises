package com.conmela.exercises.user.service.dto;


import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * (TDeptDTO)实体映射类
 *
 * @author ysq
 * @since 2020/07/28
 */
@Data
@ApiModel("TDeptDTO")
public class TDeptDTO {
    @ApiModelProperty(value = "id")
    private Integer id;


    @ApiModelProperty("")
    private String avatarName;


    @ApiModelProperty("")
    private String avatarPath;


    @ApiModelProperty("")
    private Integer dept;


    @ApiModelProperty("")
    private String email;


    @ApiModelProperty("")
    private String gender;


    @ApiModelProperty("")
    private String idCard;


    @ApiModelProperty("")
    private String password;


    @ApiModelProperty("")
    private String phone;


    @ApiModelProperty("")
    private Date pwdResetTime;


    @ApiModelProperty("")
    private Integer roles;

}
