package com.company;

class  prectiseThead extends Thread{
    public void run(){
        while (true){
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.print("Good Morning: ");
            System.out.println(this.getPriority());
        }
    }
}class  prectiseTheadB extends Thread{
    public void run(){
        while (true){
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }

            System.out.println("Welcome! ");
            System.out.println(this.getPriority());
            System.out.println(this.getState());
        }
    }
}
public class prectiseSet_13{
    public static void main(String[] args) {
        prectiseThead t1 = new prectiseThead();
        t1.setPriority(Thread.MIN_PRIORITY);
        prectiseTheadB t2 = new prectiseTheadB();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        t1.start();
        t2.start();
    }
}
