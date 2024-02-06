package fileExercise;

import java.io.*;

public class CountCharacterType {
    public static void main(String[] args) {
        String pathIn ="C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        String pathOut = "C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(pathIn)); PrintWriter out = new PrintWriter(new FileWriter(pathOut))) {
            String line = in.readLine();
            int vowels=0;
            int punctuation=0;
            int other=0;
            while(line!=null){
                for(char c:line.toCharArray()){
                   if(c == 'a' || c =='e'|| c=='o'||c=='u'||c=='i')
                       vowels++;
                   else if(c == '!' || c == '?' || c=='.'|| c ==',')
                        punctuation++;
                    else if(c != 32)
                        other++;

                }
                line=in.readLine();
            }
            out.println("Vowels: "+vowels);
            out.println("Other Symbols: "+other);
            out.println("Punctuation: "+punctuation);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
