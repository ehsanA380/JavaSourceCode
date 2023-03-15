package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class cwh_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        HashMap<Integer,String> myHashMap = new HashMap<>(6,0.5f);
        myHashMap.put(1,"mango");
        myHashMap.put(2,"orange");
        myHashMap.put(3,"grapes");
        myHashMap.put(4,"lichi");
        myHashMap.put(5,"apple");
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(7);
        myHashSet.add(6);
        myHashSet.add(9);
        System.out.println(myHashSet);
    }
}
