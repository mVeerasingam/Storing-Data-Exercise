package ìe.atu;

import java.io.*;

public class CreateFile {
    public static void main(String[] args){

        {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is locate at " + myFile.getAbsolutePath());
            String content = "Details to write";
            try
            {
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("pog champ");
                myWriter.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
