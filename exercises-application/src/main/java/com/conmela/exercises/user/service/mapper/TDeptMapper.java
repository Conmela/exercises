package com.conmela.exercises.user.service.mapper;

 import com.spring.EntityMapper;
 import org.mapstruct.Mapper;
 import com.conmela.exercises.user.service.dto.TDeptDTO;
 import com.conmela.exercises.user.domain.TDept;
 import org.mapstruct.ReportingPolicy;
 /**
 * (TDept)映射Dto
 *
 * @author ysq
 * @since 2020/07/28
 */
 @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
 public interface TDeptMapper extends EntityMapper<TDeptDTO,TDept> {
 }
