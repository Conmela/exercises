package com.conmela.exercises.user.service.mapper;

 import com.spring.EntityMapper;
 import org.mapstruct.Mapper;
 import com.conmela.exercises.user.service.dto.TUserDTO;
 import com.conmela.exercises.user.domain.TUser;
 import org.mapstruct.ReportingPolicy;
 /**
 * (TUser)映射Dto
 *
 * @author ysq
 * @since 2020/07/28
 */
 @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
 public interface TUserMapper extends EntityMapper<TUserDTO,TUser> {
 }
