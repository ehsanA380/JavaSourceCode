package com.company;

public class febbonaci
{
    public static int feb_rec(int n){
        if(n==1 || n==2){
            return  n-1;
        }else {
            return  feb_rec(n-1)+feb_rec(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(feb_rec(9));
    }
}
