package file;

import java.io.*;
import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) throws FileNotFoundException {
        String input = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        try{
            Scanner scanner = new Scanner(new FileInputStream(input));
            PrintWriter out = new PrintWriter(new FileOutputStream(output));
            while(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    out.println(scanner.nextInt());
                }
                scanner.next();
            }
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
}}
