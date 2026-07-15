package com.examples.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
public class fileWrite {
    public static void main(String[] args) {
        String fileName = "exp.txt";
         
        // try with resource - ensures resources are released 
        //once try-catch finishes
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("hello");
            writer.flush();
            System.out.println("Filw written successfully");
        }catch(IOException exception){
            System.out.printf("Exception occurred %s \n",exception.getMessage());
        }
    }
}
