package com.company;

class MyThread extends  Thread{
    @Override
    public void run(){

        while(true){
            System.out.println("I am cooking food");
            System.out.println("I am happy");
        }


    }
}
class MyThread3 extends  Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am chatting with her");
            System.out.println("I am sad");
        }
    }
}
public class cwh_70 {
    public static void main(String[] args) {

    MyThread t1 = new MyThread();
    MyThread3 t2= new MyThread3();
    t1.start();
    t2.start();
    }
}
