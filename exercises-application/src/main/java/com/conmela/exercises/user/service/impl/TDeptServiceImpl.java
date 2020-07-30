package com.conmela.exercises.user.service.impl;

import com.conmela.exercises.user.service.dto.TDeptDTO;
import com.conmela.exercises.user.repository.TDeptRepository;
import com.conmela.exercises.user.service.TDeptService;
import lombok.extern.slf4j.Slf4j;
import com.conmela.exercises.user.service.mapper.TDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.List;
import java.util.Optional;

/**
 * (TDept)表服务实现类
 *
 * @author ysq
 * @since 2020/07/28
 */
@Slf4j
@Service("tDeptService")
public class TDeptServiceImpl implements TDeptService {
    
    @Resource
    private TDeptRepository tDeptRepository;
    
    @Resource
    private TDeptMapper TDeptMapper;
    
    @Override
    public TDeptDTO createTDept(TDeptDTO tDept){
        return TDeptMapper.toDto(tDeptRepository.save(TDeptMapper.toEntity(tDept)));
    }
    
    @Override
    public void deleteTDept(Integer id){
        tDeptRepository.deleteById(id);
    }

    @Override
    public List<TDeptDTO> listTDepts(){
        return TDeptMapper.toDto(tDeptRepository.findAll());
    }

    @Override
    public TDeptDTO getTDept(Integer id){
        return TDeptMapper.toDto(tDeptRepository.findById(id).get());   
    }

    @Override
    public TDeptDTO updateTDept(Integer id, TDeptDTO tDept){
        return TDeptMapper.toDto(tDeptRepository.save(TDeptMapper.toEntity(tDept)));
    }

}