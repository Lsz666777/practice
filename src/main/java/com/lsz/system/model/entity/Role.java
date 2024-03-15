package com.lsz.system.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.lsz.basic.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author lsz
 * @since 2024-03-15
 */
@Getter
@Setter
public class Role extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 角色名字
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 创建者
     */
    private Long createUser;

    /**
     * 修改者
     */
    private Long updateUser;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 逻辑删除 0为否 1为是
     */
    private String del;
}
