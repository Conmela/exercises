package com.conmela.exercises.user.controller;

import com.conmela.exercises.user.service.dto.TDeptDTO;
import com.conmela.exercises.user.service.TDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (TDept)表控制层
 *
 * @author ysq
 * @since 2020/07/28
 */
@Api("(TDept)服务")
@RestController
@RequestMapping("tDept")
public class TDeptController {

    @Autowired
    private TDeptService tDeptService;
    
    @PostMapping("")
    @ApiOperation(value = "创建", notes = "创建")
    @ApiImplicitParam(name = "tDept", value = "", dataType = "TDept", required = true, paramType = "body" )
    public TDeptDTO createTDept(@RequestBody TDeptDTO tDept){
        return tDeptService.createTDept(tDept);
    }
    
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "id", dataType = "Integer", required = true, paramType = "path")
    })
    public void deleteTDept(@PathVariable Integer id){
        tDeptService.deleteTDept(id);
    }

    @GetMapping("")
    @ApiOperation(value = "获取列表", notes = "获取列表")
    public List<TDeptDTO> listTDepts(){
        return tDeptService.listTDepts();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取", notes = "根据id获取")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "id", dataType = "Integer", required = true, paramType = "path")
    })
    public TDeptDTO getTDept(@PathVariable Integer id){
        return tDeptService.getTDept(id);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "更新", notes = "更新")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "id", dataType = "Integer", required = true, paramType = "path"),
            @ApiImplicitParam(name = "tDept", value = "", dataType = "TDept", required = true, paramType = "body")
    })
    public TDeptDTO updateTDept(@PathVariable Integer id, @RequestBody TDeptDTO tDept){
        return tDeptService.updateTDept(id, tDept);
    }

}