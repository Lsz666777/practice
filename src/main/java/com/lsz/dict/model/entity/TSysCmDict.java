package com.lsz.dict.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lsz.basic.BaseEntity;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 字典信息
 * </p>
 *
 * @author lsz
 * @since 2024-03-15
 */
@Getter
@Setter
@TableName("t_sys_cm_dict")
public class TSysCmDict extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键;字典的主键
     */
    private String dictId;

    /**
     * 字典分类代码;字典分类代码，如UC_GENDER（性别），UC_CER_TYPE（证件类型）
     */
    private String zaDictTypeCode;

    /**
     * 字典枚举代码;字典枚举代码，如性别分类下：1（男），2（女）
     */
    private String zaDictEnumCode;

    /**
     * 字典枚举名称;字典枚举名称，如性别分类下：男（1），女（2）
     */
    private String zaDictEnumName;

    /**
     * 字典别名;字典其他相近名称
     */
    private String zaDictAlias;

    /**
     * 父级字典枚举代码;父级字典枚举代码，如性别分类下：1（男），2（女）
     */
    private String zaParentDictEnumCode;

    /**
     * 排序号;
     */
    private Integer sortNumber;

    /**
     * 描述;
     */
    private String remark;

    /**
     * 启用状态;0未启用，1启用
     */
    private String enableFlag;

    /**
     * 创建时间;数据创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人姓名;数据创建人姓名
     */
    private String createrName;

    /**
     * 修改人姓名;数据修改人姓名
     */
    private String modifierName;

    /**
     * 修改时间;数据修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 版本号;数据版本号
     */
    private String version;

    /**
     * 逻辑删除;1：逻辑删除	0：正常数据
     */
    private String del;

    /**
     * 显示方式;0 :tab方式  、 1: 树形
     */
    private String showType;

    /**
     * 数字标识编码;记录数字标识编码
     */
    private String ptid;

    /**
     * 扩展字段
     */
    private String extFild;
}
