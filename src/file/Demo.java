package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) {
        String input = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try (InputStream in = new FileInputStream(input)){

            int oneByte = in.read();
            while(oneByte>=0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));

                oneByte=in.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
