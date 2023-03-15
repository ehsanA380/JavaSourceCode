package com.company;
import java.util.*;
public class cwh_92_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        l2.add(61);
        l2.add(41);
        l2.add(81);
        l2.add(61);
        l1.add(4);
        l1.add(8);
        l1.add(6);
        l1.add(3,1);
//        l2.clear();
        l1.set(1,556);
        l1.ensureCapacity(4);
        System.out.println( l2.clone());
//        System.out.println(l1.toArray());
        l1.addAll(l2);
        System.out.println(l1.indexOf(6));
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" ");

        }
    }
}
