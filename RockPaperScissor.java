package com.company;

import java.util.Random;
import  java.util.Scanner;
public class RockPaperScissor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        System.out.println("-------------welcome to RockPaperScissors game!-------------\n0.Rock\n1.Scissors\n2.paper");
        int upt=0;
        int cpt=0;
        int i=0;
        while(i<5) {

            System.out.printf("-----------%d round----------\n",i+1);
            System.out.print("Enter the number: ");
            int user = sc.nextInt();
            int computer = random.nextInt(3);

            if (user == 0 && computer == 1) {
                upt++;
                System.out.println("user-Rock\ncomputer-scissors");
                System.out.println("user pt: "+upt);

            } else if (user == 1 && computer == 0) {
                System.out.println("user-Scissor\ncomputer-rock");
                cpt++;
                System.out.println("computer pt: "+cpt);

            } else if (user == 1 && computer == 2) {
                System.out.println("user-Scissors\ncomputer-paper");
                upt++;
                System.out.println("user pt: "+upt);

            } else if (user == 2 && computer == 1) {
                System.out.println("user-paper\ncomputer-Scissors");
                cpt++;
                System.out.println("computer pt: "+cpt);

            } else if (user == 2 && computer == 0) {
                System.out.println("user-paper\ncomputer-rock");
                upt++;
                System.out.println("user pt: "+upt);

            } else if (user == 0 && computer == 2) {
                System.out.println("user-Rock\ncomputer-paper");
                cpt++;
                System.out.println("computer pt: "+cpt);

            }
            else if(user>2){
                System.out.println("invalid entry!");
                i--;
            }
            else {
                System.out.println("Draw");
                i--;
            }
            i++;
        }
        if(upt>cpt){
            System.out.println("Congrantulation! You are win");
            System.out.println("user pt-:"+upt+"computer-:"+cpt);
        }
//        it is unreachable code when we execute the game for 5 time
//        else if(upt==cpt){
//            System.out.println("draw match! play again");
//        }
        else {
            System.out.println("Sorry! you are loose");
            System.out.println("user pt-:"+upt+"computer-:"+cpt);

        }
//        System.out.println(computer);
    }
}
