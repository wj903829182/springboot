package com.jack.mapper;

import com.jack.entity.Student;
import tk.mybatis.mapper.common.Mapper;

/**
 * StudentMapper集成了通用Mapper，提供了单表的基础操作
 */
public interface StudentMapper extends Mapper<Student> {
}