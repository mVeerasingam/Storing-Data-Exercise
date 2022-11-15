package ìe.atu;

import java.io.*;
import java.util.Scanner;


public class CreateFile {
    public static void main(String[] args) {
        Scanner inputFile = new Scanner(System.in);
        System.out.println("Enter filename :");
        String user_file = inputFile.nextLine();
        //open the file
        try{
            Scanner readFile = new Scanner(new File(user_file));
            while(readFile.hasNextLine()) {
                System.out.println(readFile.nextLine());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
