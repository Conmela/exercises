package com.conmela.exercises.repository;

import com.conmela.exercises.entity.TUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * (TUser)表数据库访问层
 *
 * @author ysq
 * @since 2020/07/24
 */
@Repository
public interface TUserRepository extends JpaRepository<TUser ,Integer>{

  
}