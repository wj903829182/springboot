package com.jack.decoratemodel;

/**
 * Created by jack on 2017/8/15.
 * 老爸查看成绩单
 */
public class FatherMain {
    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr = null;
        //原装的成绩单
        sr = new FouthGradeSchoolReport();
        //加了高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        //加了成绩排名的成绩单
        sr = new SortDecorator(sr);
        //看成绩单
        sr.report();
        sr.sign("jack");
    }
}
