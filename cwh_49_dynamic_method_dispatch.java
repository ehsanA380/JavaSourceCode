package com.company;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 PM");
    }
    public void on(){
        System.out.println("Tunring on Phone....");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music.....");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone phone=new SmartPhone();
        SmartPhone phone=new SmartPhone();
        phone.music();
    }
}
