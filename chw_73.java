package com.company;

class  MyThr extends  Thread{
    public  MyThr(String name){
        super(name);
    }
    public void run(){
        int i =35;
//        while (true){
//        System.out.println("I am a thread");
//
//        }
    }
}
public class chw_73 {

    public static void main(String[] args) {
        MyThr t = new MyThr("harry");
        MyThr t2 = new MyThr("candr");
        t.start();
        t2.start();
        System.out.println("The id of the thread t is "+ t.getId());
        System.out.println("The id of the thread name is "+ t.getName());
        System.out.println("The id of the thread t is "+ t2.getId());
        System.out.println("The id of the thread name is "+ t2.getName());
    }
}
