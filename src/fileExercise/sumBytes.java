package fileExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sumBytes {
    public static void main(String[] args) {
        String pathIn = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        try(BufferedReader in = new BufferedReader(new FileReader(pathIn))){
            String line= in.readLine();
            int sum=0;
            while(line!=null){
                for(char c:line.toCharArray())
                    sum+=c;
                line=in.readLine();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
