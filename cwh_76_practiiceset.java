package com.company;

class Practice13a extends  Thread{
    public void  run(){
        for (int i=0;i<100;i++){
            try{

                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }

}class Practice13b extends  Thread{
    public void  run(){
//        while (true){
//            try{
//
//            Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome!");
//        }
    }

}
public class cwh_76_practiiceset {
    public static void main(String[] args) {
        Practice13a p1=new Practice13a();
        Practice13b p2  =new Practice13b();
        p1.setPriority(6);
        p1.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p1.start();
        System.out.println(p1.getState());
        System.out.println(Thread.currentThread().getState());
//
//        p2.start();
    }
}
