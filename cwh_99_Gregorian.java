package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

//class SayHello extends TimerTask {
//    public void run() {
//        Calendar c= Calendar.getInstance();
//
////        System.out.println("Printing statement after every 2 seconds");
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) +" : "+ c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND)+" : "+c.get(Calendar.MILLISECOND));
//    }
//}
public class cwh_99_Gregorian {
    static void T1() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) +" : "+ c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
//        Timer timer = new Timer();
//        timer.schedule( new SayHello(), 1000, 1000);
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2040));
        System.out.println(cal.getTime());
//        System.out.println(TimeZone.getAvailableIDs()[0]);
//        System.out.println(TimeZone.getAvailableIDs()[1]);
//        System.out.println(TimeZone.getAvailableIDs()[2]);
//        System.out.println(TimeZone.getAvailableIDs()[3]);
//        System.out.println(TimeZone.getAvailableIDs()[4]);
//        System.out.println(TimeZone.getAvailableIDs()[5]);
        try{

        for(int i=0;i<1000;i++){
            System.out.println(TimeZone.getAvailableIDs()[i] +" " + i);
        }
        }
        catch (Exception e){
            System.out.println(" index out of bound");
            System.out.println(e);
        }
    }
}