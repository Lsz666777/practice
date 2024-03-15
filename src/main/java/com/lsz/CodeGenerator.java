/**
 * Copyright (C) 2023 - ⻓期
 * All rights reserved.
 * <p>
 * 版权所有 (C) 中国烟草总公司
 */
package com.lsz;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.lsz.basic.BaseEntity;

import java.util.Collections;

/**
 * @Author : liushaozhou
 * @Email :  liushaozhou@hcrc1.wecom.work
 * @Create : 2024/03/14 20:07
 * @Description :
 */
public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/practice?serverTimezone=UTC", "root", "1234")
                .globalConfig(builder -> {
                    builder.author("lsz") // 设置作者
                            .dateType(DateType.TIME_PACK)//时间策略
                            .commentDate("yyyy-MM-dd")//注释日期
                            .outputDir(System.getProperty("user.dir")+"\\src\\main\\java\\"); // 指定输出目录


                })
                .packageConfig(builder -> {
                    builder.parent("com.lsz.dict") // 设置父包名
                            .entity("model.entity")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("controller")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir")+"\\src\\main\\java\\com\\lsz\\dict\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_sys_cm_dict,t_sys_cm_dict_type") // 设置需要生成的表名
                            /*  .addTablePrefix("tb_") // 设置过滤表前缀*/
                            /*   .entityBuilder().superClass(BaseEntity.class) // 设置父类*/
                            .controllerBuilder()
                            .enableRestStyle()//开启restful风格
                            .entityBuilder()
                            .superClass(BaseEntity.class)
                            .idType(null)
                            .enableLombok()//开启 Lombok
                            .mapperBuilder()
                            .enableMapperAnnotation()//开启 @Mapper
                            .serviceBuilder().formatServiceFileName("%sService")

                    ;  //去掉service中的I
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
