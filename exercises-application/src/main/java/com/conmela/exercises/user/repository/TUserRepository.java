package com.conmela.exercises.user.repository;

import com.conmela.exercises.user.domain.TUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * (TUser)表数据库访问层
 *
 * @author ysq
 * @since 2020/07/28
 */
@Repository
public interface TUserRepository extends JpaRepository<TUser ,Integer>{

  
}