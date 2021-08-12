package com.premierinn.utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BrowserUtils {

    public static void saveInfo(String info, String filepath){
        try{
            FileWriter fileWriter = new FileWriter(filepath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println(info);
            printWriter.flush();

        }catch (Exception e){
            System.out.println("Failed to record");

        }

    }
}
