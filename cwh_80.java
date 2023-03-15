package com.company;

public class cwh_80 {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        try{
            int c=a/b;
            System.out.println("The result is  "+ c);
        }
        catch(Exception e){
            System.out.println("Sorry! we failed to divide. Reason--- ");
            System.out.println(e);

        }
    }

}
