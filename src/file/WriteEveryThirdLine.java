package file;


import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String input = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        try{
            BufferedReader reader =  new BufferedReader(new FileReader(input));
            PrintWriter out = new PrintWriter(output);
            int counter =1;
            String line = reader.readLine();
            while(line!=null){
                if(counter%3==0)
                    out.println(line);
                counter++;
                line= reader.readLine();
            }
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
