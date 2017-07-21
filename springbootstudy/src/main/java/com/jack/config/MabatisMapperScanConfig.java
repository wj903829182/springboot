package com.jack.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jack on 2017/7/20.
 */
@Configuration
//注意，由于MabatisMapperScanConfig执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MybatisConfig.class)
public class MabatisMapperScanConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //注意这里的sqlSessionFactory就是MybatisConfig里面的sqlSessionFactoryBean方法，注解bean的名字
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //接口路径，通过这些接口调用sql的配置，操作数据库
        mapperScannerConfigurer.setBasePackage("com.jack.mapper");
        return mapperScannerConfigurer;
    }
}
