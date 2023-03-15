package com.company;
class  MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString";
    } @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        int a=8;
        int b=0;
//        if(b==0){
//            try{
//
//            throw new ArithmeticException("div by zero1");
//            }
//            catch (ArithmeticException e){
//                System.out.println("ArithmeticException Occured");
//                System.out.println(e);
//            }
//        }
//        else {
//            System.out.println(a/b);
//        }
        if(a<9){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
           finally {
                System.out.println("finished");
            }
        }
    }
}
