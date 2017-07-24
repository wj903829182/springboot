package com.jack.entity;

import javax.persistence.*;

public class Student {
    @Id
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别，女为0，男为1
     */
    private Byte sex;

    /**
     * 备注
     */
    private String note;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别，女为0，男为1
     *
     * @return sex - 性别，女为0，男为1
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别，女为0，男为1
     *
     * @param sex 性别，女为0，男为1
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }
}