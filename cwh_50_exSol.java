package com.company;
import  java.util.Random;
import java.util.Scanner;

class  Game{
    public int number;
    public int noOfGuesses=0;
    public int inputNumber;
     Game(){
         System.out.println("I am default game constructor");
        Random rand=new Random();
        this.number= rand.nextInt(100);
    }



    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
         inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber(){
         noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed the number it right , it was %d\n you guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too less...");
        }
        else {
            System.out.println("Too high...");
        }
        return  false;
    }
}
public class cwh_50_exSol {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
            System.out.println(b);
        }

    }
}
