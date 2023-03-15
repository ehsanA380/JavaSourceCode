package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
@FunctionalInterface
 interface MyInf {
    void display();
}

public class cwh_112_Advance_PS2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//        MyDeprecated d =new MyDeprecated();
//        d.meth1();
//        MyInf i = () -> System.out.println("I am display");
//        i.display();
        int i=15;
        String table="";
        for(int j=1;j<=10;j++){
            table +=i+"X"+j+"="+i*j+"\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("MultiplicaitonTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
