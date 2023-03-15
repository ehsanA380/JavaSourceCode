package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_DateTimeFormator {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy -- E H:m:s a --- G");
//        DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df);
        String myDate= dt.format(df);// creating date string using date and format;
        System.out.println(myDate);
    }
}
