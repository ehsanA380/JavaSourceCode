package com.company;

import java.util.LinkedList;

public class cwh_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        LinkedList<Integer> l2= new LinkedList<>();
        l2.add(61);
        l2.add(41);
        l2.add(81);
        l2.add(61);
        l1.add(4);
        l1.add(8);
        l1.add(6);
        l1.add(3,1);
        l1.set(1,556);
        l1.addAll(l2);
        l1.addFirst(0);
        l1.addLast(555);
        l1.offerFirst(553533);
        System.out.println(l1.poll());
//        l1.pop();
        System.out.println("this is the clone (or copy) of l1 linkedlist: "+l1.clone());
//        System.out.println(l1.indexOf(6));
        for(int i=0;i<l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}
