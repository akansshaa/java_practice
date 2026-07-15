package com.examples.FileHandling;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class RobustFileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name of file you wish to read:");
        String fileName = sc.next();
        sc.close();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.println((char)read);
            }
        }catch(FileNotFoundException e){
            System.out.printf("%s not found",fileName);
        }catch(IOException exception){
            System.out.printf("Exception occured: %s",exception.getMessage());
        }
    }
}

//fileNotFound is a child of IO exception . catch is written in more specific to less specific order
// we can also check if the exception is an instanceOf FileNotFoundException inside IO catch