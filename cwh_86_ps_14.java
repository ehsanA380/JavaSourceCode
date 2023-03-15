package com.company;

import java.util.Scanner;

class MaxRetriesException extends Exception{
    public String toString(){
        return "You have reached the Maximum attempts";
    } public String toMessaage(){
        return "You have reached the Maximum attempts";
    }
}
class ss {
    static void plus(int a, int b) {
        System.out.println(a + b);
    }
    public void ArrayAccess()throws MaxRetriesException{
        boolean flag=true;
        int [] marks= new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try{
                System.out.println("Enter the value of index: ");
                index= sc.nextInt();
                System.out.println("The value of marks int is "+marks[index]);
                break;
            }
            catch (Exception e){
                i++;
                System.out.println("Invalid Index!");
            }

        }
        if(i>4){
            try{
                throw new MaxRetriesException();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class cwh_86_ps_14 {
    public static void main(String[] args) {

//        problem 1
//        syntex error -int a=7
        int age = 78;
        int year_born = 2000 - 78; // logical error
//        System.out.println(6/0);
//        problem2
        ss s=new ss();

        try {
            s.plus(2,001);
            int a = 666 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("hehe");
        } catch (ArithmeticException e) {
            System.out.println("haha");
        }
        //problem 4
//        boolean flag=true;
//        int [] marks= new int[3];
//        marks[0]=7;
//        marks[1]=56;
//        marks[2]=6;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i=0;
//        while (flag && i<5){
//            try{
//                System.out.println("Enter the value of index: ");
//                index= sc.nextInt();
//                System.out.println("The value of marks int is "+marks[index]);
//                break;
//            }
//            catch (Exception e){
//                i++;
//                System.out.println("Invalid Index!");
//            }
//
//        }
//        if(i>4){
//            try{
//                throw new MaxRetriesException();
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        }
//        problem 5
        try {
            s.ArrayAccess();
        }
        catch (Exception e){
            System.out.println("custom Exception");
            System.out.println(e);
        }

    }
}
