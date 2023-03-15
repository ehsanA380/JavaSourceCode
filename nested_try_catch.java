package com.company;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with ");
        int number = sc.nextInt();
        try {
            System.out.println("welcome to video no 82");
            try{
                System.out.println(marks[ind]);
                try{
                    System.out.println(marks[ind]/number);
                }
                catch (ArithmeticException e){
                    System.out.println("ArithmeticException occured!");
                    System.out.println(e);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
//        finally {
            System.out.println(" I am finally block");
//        }
    }
}
