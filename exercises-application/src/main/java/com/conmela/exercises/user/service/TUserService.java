package com.conmela.exercises.user.service;

import com.conmela.exercises.user.service.dto.TUserDTO;
import java.util.List;

/**
 * (TUser)表服务接口
 *
 * @author ysq
 * @since 2020/07/28
 */
public interface TUserService {
    /**
     * 创建
     *
     * @param tUser 
     * @return 
     */
    TUserDTO createTUser(TUserDTO tUser);

    /**
     * 删除
     *
     * @param id 的
     */
    void deleteTUser(Integer id);

    /**
     * 获取列表
     *
     * @return 列表
     */
    List<TUserDTO> listTUsers();

    /**
     * 获取
     *
     * @param id 的
     * @return 
     */
    TUserDTO getTUser(Integer id);
    
    /**
     * 更新
     *
     * @param id 的
     * @param tUserDTO 
     * @return 
     */
    TUserDTO updateTUser(Integer id, TUserDTO tUser);

}