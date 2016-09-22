package org.haolan.utils;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.ConfigGenerator;

public class MybatisPlusGenerator {
	public static void main(String[] args) {
        ConfigGenerator cg = new ConfigGenerator();

        // 配置 MySQL 连接
        cg.setDbDriverName("com.mysql.jdbc.Driver");
        cg.setDbUser("root");
        cg.setDbPassword("123456");
        cg.setDbUrl("jdbc:mysql://127.0.0.1/blog?characterEncoding=utf8");
        cg.setTableNames(new String[]{"b_base_user"});
        // 配置包名
        cg.setEntityPackage("org.haolan.bean.base");
        cg.setMapperPackage("org.haolan.dao.base");
        cg.setServicePackage("org.haolan.service.base");
        cg.setXmlPackage("org.haolan.mapping.base");
        cg.setDbPrefix(true);
        cg.setServiceImplPackage("org.haolan.serviceImpl.base");
        cg.setIdType(IdType.AUTO);
        // 配置保存路径
        cg.setSaveDir("/home/luoyu");

        // 其他参数请根据上面的参数说明自行配置，当所有配置完善后，运行AutoGenerator.run()方法生成Code
        // 生成代码
        AutoGenerator.run(cg);
    }
}
