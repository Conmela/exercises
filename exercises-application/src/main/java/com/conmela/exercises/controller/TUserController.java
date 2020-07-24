package com.conmela.exercises.controller;

import com.conmela.exercises.entity.TUser;
import com.conmela.exercises.service.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (TUser)表控制层
 *
 * @author ysq
 * @since 2020/07/24
 */
@Api("(TUser)服务")
@RestController
@RequestMapping("tUser")
public class TUserController {

    @Autowired
    private TUserService tUserService;
    
    @PostMapping("")
    @ApiOperation(value = "创建", notes = "创建")
    @ApiImplicitParam(name = "tUser", value = "", dataType = "TUser", required = true, paramType = "body" )
    public TUser createTUser(@RequestBody TUser tUser){
        return tUserService.createTUser(tUser);
    }
    
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "id", dataType = "Integer", required = true, paramType = "path")
    })
    public void deleteTUser(@PathVariable Integer id){
        tUserService.deleteTUser(id);
    }

    @GetMapping("")
    @ApiOperation(value = "获取列表", notes = "获取列表")
    public List<TUser> listTUsers(){
        return tUserService.listTUsers();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取", notes = "根据id获取")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "id", dataType = "Integer", required = true, paramType = "path")
    })
    public TUser getTUser(@PathVariable Integer id){
        return tUserService.getTUser(id);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "更新", notes = "更新")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "id", dataType = "Integer", required = true, paramType = "path"),
            @ApiImplicitParam(name = "tUser", value = "", dataType = "TUser", required = true, paramType = "body")
    })
    public TUser updateTUser(@PathVariable Integer id, @RequestBody TUser tUser){
        return tUserService.updateTUser(id, tUser);
    }

}