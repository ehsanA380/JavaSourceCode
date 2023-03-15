package com.company;

import static java.lang.Math.floorDiv;
public class reverseArray
{
    public static void main(String[] args) {
        int []arr={2,5,3,6,2,5,6,4,3,2};
        int temp;
        int l=arr.length;
        int n=floorDiv(arr.length,2);
//        System.out.println(n);
        for (int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
            System.out.println(arr[i]);
        }
        for (int e :arr) {
            System.out.print(e+" ");
        }
    }
}
