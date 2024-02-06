package file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String input = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        try(InputStream in =new FileInputStream(input); OutputStream out = new FileOutputStream(output)){
            int oneByte = in.read();
            while(oneByte>=0){
                if(oneByte == 10 || oneByte==32){
                    out.write(oneByte);
                }else{
                    String str = oneByte+"";
                    for(int i=0;i<str.length();i++)
                        out.write(str.charAt(i));
                }
                oneByte=in.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
