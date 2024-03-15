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
public class Menu extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 父级菜单
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 权限编码
     */
    private String perms;

    /**
     * 权限类型
     */
    private Integer type;

    /**
     * 排序
     */
    private Integer orderNum;

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
}
