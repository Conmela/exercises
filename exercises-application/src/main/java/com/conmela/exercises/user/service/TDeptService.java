package com.conmela.exercises.user.service;

import com.conmela.exercises.user.service.dto.TDeptDTO;
import java.util.List;

/**
 * (TDept)表服务接口
 *
 * @author ysq
 * @since 2020/07/28
 */
public interface TDeptService {
    /**
     * 创建
     *
     * @param tDept 
     * @return 
     */
    TDeptDTO createTDept(TDeptDTO tDept);

    /**
     * 删除
     *
     * @param id 的
     */
    void deleteTDept(Integer id);

    /**
     * 获取列表
     *
     * @return 列表
     */
    List<TDeptDTO> listTDepts();

    /**
     * 获取
     *
     * @param id 的
     * @return 
     */
    TDeptDTO getTDept(Integer id);
    
    /**
     * 更新
     *
     * @param id 的
     * @param tDeptDTO 
     * @return 
     */
    TDeptDTO updateTDept(Integer id, TDeptDTO tDept);

}