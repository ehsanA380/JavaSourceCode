package com.company;

class CannotDivideByZero extends Exception{
    @Override
    public String toString(){
        return "Can not divide by Zero";
    }
}class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "The Input Can not be grater than 100000 ";
    }
}class MaxMultipleInputException extends Exception{
    @Override
    public String toString(){
        return "Multiple input cannot be grater than 7000";
    }
}
class calculator {
   void add(int a,int b) {
       System.out.println(a+b);
   }void sub(int a,int b){
       System.out.println(a-b);
   }void multi(int a,int b)throws MaxMultipleInputException,MaxInputException{
      if(a>100000||b>10000){
           throw new MaxInputException();
       }
      if(a>7000||b>7000){
            throw new MaxMultipleInputException();
        }
       System.out.println(a*b);
   }void div(int a,int b) throws CannotDivideByZero   {
       if(b==0){
           throw  new CannotDivideByZero();
       }
       System.out.println(a/b);
   }
}
public class Cwh_Calculator {
    public static void main(String[] args) {
        calculator c= new calculator();
        c.add(4,8);
        try{
        c.multi(70000,10000);

        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
        c.div(70000,0);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
