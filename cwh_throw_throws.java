package com.company;
class NegativeRadiusException  extends  Exception{
    public  String toString(){
        return "Radius cannot be negative";
    }public  String getMessage(){
        return "Radius cannot be negative";
    }
}
public class cwh_throw_throws {
    public  static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        try{
            double ar = area(-5);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is must to be executed at any cost, beacause I am belongs to finally block");
        }
    }
}
