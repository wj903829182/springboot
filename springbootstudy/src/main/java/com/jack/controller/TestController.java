package com.jack.controller;

import com.jack.entity.Test;
import com.jack.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jack on 2017/7/20.
 */
@RestController
public class TestController {
    @Autowired
    TestMapper testMapper;

    /**
     * 通过id进行查询
     * @return
     */
    @RequestMapping(value = "/find/id")
    public String fingTestById(){
        return testMapper.findTestById(1).toString();
    }

    /**
     * 添加
     * @return
     */
    @RequestMapping(value = "/add")
    public String  addTest(){
        Test test = new Test();
        test.setName("jack add");
        test.setNote("this is add element to test table");
        int result= testMapper.add(test);
        System.out.println("add result ="+result);
        if (result >0) {
            return "添加成功";
        }else {
            return "添加失败";
        }

    }

    /**
     * 通过id删除
     * @return
     */
    @RequestMapping(value = "/delete")
    public String  deleteTestById(){

        int result= testMapper.deleteById(5);
        System.out.println("deleteTestById result ="+result);
        if (result > 0) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    /**
     * 通过id更新
     * @return
     */
    @RequestMapping(value = "/update")
    public String  updateTestById(){
        Test test = new Test();
        test.setId(20);
        test.setName("this is updete name ");
        test.setNote("this is update note");
        int result= testMapper.updateByID(test);
        System.out.println("updateTestById result ="+result);
        if (result > 0) {
            return "更新成功";
        } else {
            return "更新失败";
        }
    }

    /**
     * 通过名字进行模糊查询
     * @return
     */
    @RequestMapping(value = "/findname")
    public String  findByName(){
        List<Test> result= testMapper.findByName("jack");
        System.out.println("updateTestById result ="+result.toString());
        if (result != null) {
            return "更新成功";
        } else {
            return "更新失败";
        }
    }
}
