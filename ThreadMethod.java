package com.company;

class ThreadMethod1 extends Thread{
    @Override
    public void  run(){
        int i=0;
        while(i<100){
            System.out.println("thank you: ");
            i++;
        }
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}class ThreadMethod2 extends Thread{
    @Override
    public void  run(){
        int i=0;
        while(i<100){

            System.out.println("My thank you: ");
            i++;
        }
    }
}
public class ThreadMethod {

    public static void main(String[] args) {
        ThreadMethod1 t1 =new ThreadMethod1();
        ThreadMethod2 t2 =new ThreadMethod2();
        t1.start();
//        try{
//            t1.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
