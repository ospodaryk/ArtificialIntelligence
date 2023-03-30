package com.example.lab4;

import java.util.HashMap;
import java.util.Map;

public class User {
    String Name;
    int c1;
    int c2;
    int c3;
    int c4;
    int c5;
    int c6;
    int c7;
    int c8;
    public User() {
        c1 = 0;
        c2 = 0;
        c6 = 0;
        c7 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c8 = 0;

//        list.put("Кір", 0);
//        list.put("Грип", 0);
//        list.put("Запалення легень", 0);
//        list.put("Ангіна", 0);
//        list.put("Скарлатина", 0);
//        list.put("Свинка", 0);
//        list.put("Дизентерія", 0);
//        list.put("Гепатит", 0);
    }

    public User(String name) {
        this();
        Name = name;
    }

    public User(String name, boolean v) {
        c1 = 30;
        c2 = 30;
        c3 = 40;
        c4 = 15;
        c5 = 30;
        c6 = 60;
        c7 = 30;
        c8 = 30;
        Name = name;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    public int getC4() {
        return c4;
    }

    public void setC4(int c4) {
        this.c4 = c4;
    }

    public int getC5() {
        return c5;
    }

    public void setC5(int c5) {
        this.c5 = c5;
    }

    public int getC6() {
        return c6;
    }

    public void setC6(int c6) {
        this.c6 = c6;
    }

    public int getC7() {
        return c7;
    }

    public void setC7(int c7) {
        this.c7 = c7;
    }

    public int getC8() {
        return c8;
    }

    public void setC8(int c8) {
        this.c8 = c8;
    }
}
