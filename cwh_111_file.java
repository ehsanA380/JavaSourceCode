package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import java.io.IOException;

public class cwh_111_file {
    public static void main(String[] args)  {
        // code to create a new file
//        File myFile=new File("cwh111file.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }
        // code to write to a file
//        try {
//            FileWriter fileWriter=new FileWriter("cwh111file");
//            fileWriter.write("this is our first file from this java course . ok bye");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //Reading a file
//        File myFile = new File("this.txt");
//        try {
//            Scanner sc= new Scanner(myFile);
//            while (sc.hasNextLine()){
//                String line =sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        // deleting a file
        File myFile = new File("cwh111file");
        if(myFile.delete()){
            System.out.println("I hava deleted "+myFile.getName());
        }
        else {
            System.out.println("some problem occurred while deleting file");
        }
    }
}
