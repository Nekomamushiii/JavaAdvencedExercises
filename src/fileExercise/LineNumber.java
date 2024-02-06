package fileExercise;

import java.io.*;

public class LineNumber {
    public static void main(String[] args) {
        String pathIn ="C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt";
        String pathOut = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";
        try(BufferedReader in = new BufferedReader(new FileReader(pathIn)); PrintWriter out = new PrintWriter(new FileWriter(pathOut))) {
            String line=in.readLine();
            int num=1;
            while(line!=null){
                out.println(num+". "+line);
                num++;
                line=in.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
