package fileExercise;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String pathInWord ="C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\words.txt";
        String pathInText = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt";
        String pathOut= "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\result.txt";

        try( PrintWriter out = new PrintWriter(new FileWriter(pathOut));){

            BufferedReader inWord = new BufferedReader(new FileReader(pathInWord));
            BufferedReader inText = new BufferedReader(new FileReader(pathInText));

            Map<String,Integer> map=new LinkedHashMap<>();
            String[] lineWord = inWord.readLine().split(" ");
            String[] lineText = inText.readLine().split("\\s+");
            for (String word : lineWord)
                map.put(word, 0);
            for (String s : lineText) {
                if (map.containsKey(s))
                    map.put(s, map.get(s) + 1);
            }
            map.forEach((k,v)-> out.println(k+" - "+v));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
