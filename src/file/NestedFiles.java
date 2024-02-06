package file;

import java.io.File;

public class NestedFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if(file.exists()){
            if(file.isDirectory()){
               File[] files = file.listFiles();
               for(File f:files){
                   if(f.isDirectory())
                       System.out.printf("%s\n",f.getName());
               }
            }
        }
    }
}
