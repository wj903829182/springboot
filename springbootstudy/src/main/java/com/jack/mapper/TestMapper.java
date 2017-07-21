package com.jack.mapper;

import com.google.common.annotations.VisibleForTesting;
import com.jack.entity.Test;

import java.util.List;

/**
 * Created by jack on 2017/7/20.
 * 接口，对Test表进行操作
 */
public interface TestMapper {
    Test findTestById(int id);

    int add(Test test);

    int deleteById(int id);

    int updateByID(Test test);

    List<Test> findByName(String name);
}
