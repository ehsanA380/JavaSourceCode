package com.company;

import java.util.Date;

public class cwh_96_DateAndTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(1970+53);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
    }
}
