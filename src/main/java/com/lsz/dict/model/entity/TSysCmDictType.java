package com.lsz.dict.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lsz.basic.BaseEntity;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 字典类型信息表
 * </p>
 *
 * @author lsz
 * @since 2024-03-15
 */
@Getter
@Setter
@TableName("t_sys_cm_dict_type")
public class TSysCmDictType extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID;
     */
    private String id;

    /**
     * 字典分类代码;字典分类代码，如UC_GENDER（性别），UC_CER_TYPE（证件类型）
     */
    private String zaDictTypeCode;

    /**
     * 字典分类名称;字典分类名称，如性别（UC_GENDER），证件类型（UC_CER_TYPE）
     */
    private String zaDictTypeName;

    /**
     * 字典类型分类;0 公共字典 ，1 模版字典
     */
    private String dictTypeClassify;

    /**
     * 描述;
     */
    private String remark;

    /**
     * 逻辑删除;1：逻辑删除	0：正常数据
     */
    private String del;

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
     * 数字标识编码;记录数字标识编码
     */
    private String ptid;
}
