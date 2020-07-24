package com.conmela.exercises.service.impl;

import com.conmela.exercises.entity.TUser;
import com.conmela.exercises.repository.TUserRepository;
import com.conmela.exercises.service.TUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * (TUser)表服务实现类
 *
 * @author ysq
 * @since 2020/07/24
 */
@Slf4j
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
    
    @Autowired
    private TUserRepository tUserRepository;
    
    @Override
    public TUser createTUser(TUser tUser){
        return tUserRepository.save(tUser);
    }
    
    @Override
    public void deleteTUser(Integer id){
        tUserRepository.deleteById(id);
    }

    @Override
    public List<TUser> listTUsers(){
        return tUserRepository.findAll();
    }

    @Override
    public TUser getTUser(Integer id){
        Optional<TUser> optional = tUserRepository.findById(id);
        if (!optional.isPresent()) {
            throw new RuntimeException();
        }
        return optional.get();
    }

    @Override
    public TUser updateTUser(Integer id, TUser tUser){
        return tUserRepository.save(tUser);
    }

}