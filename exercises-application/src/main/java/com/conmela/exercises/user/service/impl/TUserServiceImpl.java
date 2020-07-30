package com.conmela.exercises.user.service.impl;

import com.conmela.exercises.user.service.dto.TUserDTO;
import com.conmela.exercises.user.repository.TUserRepository;
import com.conmela.exercises.user.service.TUserService;
import lombok.extern.slf4j.Slf4j;
import com.conmela.exercises.user.service.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.List;
import java.util.Optional;

/**
 * (TUser)表服务实现类
 *
 * @author ysq
 * @since 2020/07/28
 */
@Slf4j
@Service
@CacheConfig(cacheNames = "user")
public class TUserServiceImpl implements TUserService {

    @Resource
    private TUserRepository tUserRepository;

    @Resource
    private TUserMapper TUserMapper;

    @Override
    @CachePut
    public TUserDTO createTUser(TUserDTO tUser){
        return TUserMapper.toDto(tUserRepository.save(TUserMapper.toEntity(tUser)));
    }

    @Override
    @CacheEvict
    public void deleteTUser(Integer id){
        tUserRepository.deleteById(id);
    }

    @Override
    @Cacheable
    public List<TUserDTO> listTUsers(){
        return TUserMapper.toDto(tUserRepository.findAll());
    }

    @Override
    @Cacheable
    public TUserDTO getTUser(Integer id){
        return TUserMapper.toDto(tUserRepository.findById(id).get());
    }

    @Override
    @CachePut
    public TUserDTO updateTUser(Integer id, TUserDTO tUser){
        return TUserMapper.toDto(tUserRepository.save(TUserMapper.toEntity(tUser)));
    }

}
