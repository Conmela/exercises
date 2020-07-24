package com.conmela.exercises.service;

import com.conmela.exercises.entity.TUser;
import java.util.List;

/**
 * (TUser)表服务接口
 *
 * @author ysq
 * @since 2020/07/24
 */
public interface TUserService {
    /**
     * 创建
     *
     * @param tUser 
     * @return 
     */
    TUser createTUser(TUser tUser);

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
    List<TUser> listTUsers();

    /**
     * 获取
     *
     * @param id 的
     * @return 
     */
    TUser getTUser(Integer id);
    
    /**
     * 更新
     *
     * @param id 的
     * @param tUser 
     * @return 
     */
    TUser updateTUser(Integer id, TUser tUser);

}