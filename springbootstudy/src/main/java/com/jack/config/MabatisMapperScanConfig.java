package com.jack.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * Created by jack on 2017/7/20.
 */
@Configuration
//注意，由于MabatisMapperScanConfig执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MybatisConfig.class)
public class MabatisMapperScanConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        //不使用通用mapper的时候使用，org包开头的MapperScannerConfigurer扫描配置类
        //MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //使用通用mapper的时候，使用tk开头的MapperScannerConfigurer扫描配置类
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //注意这里的sqlSessionFactory就是MybatisConfig里面的sqlSessionFactoryBean方法，注解bean的名字
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //接口路径，通过这些接口调用sql的配置，操作数据库
        mapperScannerConfigurer.setBasePackage("com.jack.mapper");
        return mapperScannerConfigurer;
    }
}
