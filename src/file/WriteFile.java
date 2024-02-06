package file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        String input = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        List<Character> symbol = new ArrayList<>();
        Collections.addAll(symbol,',','.','!','?');
        try(InputStream in = new FileInputStream(input);OutputStream out = new FileOutputStream(output);){


            int oneByte = in.read();
            while(oneByte>=0){
                if(!symbol.contains((char) oneByte))
                    out.write(oneByte);
                oneByte=in.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
