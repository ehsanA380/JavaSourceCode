package com.company;

class MyThread4 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am inside runnable");
            i++;
        }
    }
}class MyThread5 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am also inside runnable");
            i++;
        }
    }
}
public class ThreadClass_cwh {
    public static void main(String[] args) {
        MyThread4 r1= new MyThread4();
        MyThread5 r2= new MyThread5();
        Thread t1 = new Thread(r1,"Ehsan");
        Thread t2 = new Thread(r2,"Ansari");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
