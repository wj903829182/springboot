package com.jack.enumtest;

/**
 * Created by jack on 2017/8/4.
 */
public class MainEnumTest {
    public static void main(String[] args) {
        for (EnumTest e : EnumTest.values()) {
            System.out.println(e);
        }
        System.out.println("----------------我是分隔线------------------");

        EnumTest test = EnumTest.TUE;
        switch (test) {
            case MON:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
            // ... ...
            default:
                System.out.println(test);
                break;
        }

        System.out.println("hh="+EnumTest.TUE.name());

    }
}
