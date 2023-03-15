package com.company;
class Myth extends Thread{
   public Myth(String name){
      super(name);
    }
    public  void run(){
       int i=0;
       while(i<1000){
           System.out.println("this is thread ");
           System.out.println(this.threadId());
           i++;
       }
    }
}
public class MyThreadConstructor {
    public static void main(String[] args) {
        Myth t1 = new Myth("Ehsan");
        System.out.println(t1.getName());
        System.out.println(t1.threadId());
        System.out.println(t1.getThreadGroup());

        System.out.println(t1.getClass());

        t1.start();
        System.out.println(t1.getState());
    }
}
