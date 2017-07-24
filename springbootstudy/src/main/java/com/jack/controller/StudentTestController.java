package com.jack.controller;

import com.jack.entity.Student;
import com.jack.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jack on 2017/7/24.
 * 使用通用mapper进行操作
 * 文档地址：https://mapperhelper.github.io/docs/
 */
@RestController
public class StudentTestController {
    @Autowired
    StudentMapper studentMapper;

    /**
     *添加学生
     * @return
     */
    @RequestMapping(value = "/student/add")
    public String addStudent(){
        Student student = new Student();
        student.setName("jackmapper1");
        student.setSex((byte) 0);
        student.setNote("采用通用mapper和代码自动生成");
        int result = studentMapper.insert(student);
        if (result > 0) {
            return "添加学生成功";
        }else {
            return "添加学生失败";
        }
    }

    /**
     * 删除学生
     * @return
     */
    @RequestMapping(value = "/student/delete")
    public String deleteStudent(){
        Student student = new Student();
        student.setId(2);
        int result = studentMapper.delete(student);
        if (result > 0) {
            return "删除学生成功";
        }else {
            return "删除学生失败";
        }
    }

    /**
     * 更新学生信息
     * @return
     */
    @RequestMapping(value = "/student/update")
    public String updateStudent(){
        Student student = new Student();
        student.setId(3);
        student.setName("nameupdate");
        student.setSex((byte) 0);
        student.setNote("this is update note");
        int result = studentMapper.updateByPrimaryKey(student);
        if (result > 0) {
            return "修改学生成功";
        }else {
            return "修改学生失败";
        }
    }

    /**
     * 查找学生信息
     * @return
     */
    @RequestMapping(value = "/student/select")
    public Student selectStudent(){
        Student student = new Student();
        student.setId(5);
        Student result = studentMapper.selectByPrimaryKey(student);
        return result;
    }
}
