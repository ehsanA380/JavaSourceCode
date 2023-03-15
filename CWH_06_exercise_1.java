package com.company;

import java.util.Scanner;

public class CWH_06_exercise_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int eng,math,hindi,sst,gk;
        float percentage,total;
        System.out.println("Enter your marks out of 100 in subjects respectively-\n1.English\n2.Math\n3.Hindi\n4.Sst\n5.GK");
        eng=sc.nextInt();
        math=sc.nextInt();
        hindi=sc.nextInt();
        sst=sc.nextInt();
        gk=sc.nextInt();
        total=eng+math+hindi+sst+gk;
        percentage=total/5f;
        System.out.print("Your percentage is ");
        System.out.print(percentage);

    }
}
