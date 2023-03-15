package com.company;

import java.util.ArrayDeque;

public class cwh_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(59);
        ad1.add(58);
        ad1.add(56);
        ad1.addFirst(1);
        System.out.println(ad1.size());
        System.out.println(ad1.getFirst());
//        System.out.println(ad1.getClass());
        System.out.println(ad1.remove(6));
        System.out.println(ad1.removeFirstOccurrence(56));
        System.out.println(ad1.removeLastOccurrence(56));
    }
}
