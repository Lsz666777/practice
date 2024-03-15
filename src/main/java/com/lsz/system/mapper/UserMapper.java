package com.lsz.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsz.system.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author lsz
 * @since 2024-03-15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
