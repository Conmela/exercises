package com.conmela.exercises.user.repository;

import com.conmela.exercises.user.domain.TDept;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * (TDept)表数据库访问层
 *
 * @author ysq
 * @since 2020/07/28
 */
@Repository
public interface TDeptRepository extends JpaRepository<TDept ,Integer>{

  
}