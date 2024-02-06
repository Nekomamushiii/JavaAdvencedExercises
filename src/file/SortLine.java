package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLine {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path output = Paths.get("C:\\Users\\fujits\\Desktop\\MLCJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");
        try{
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream().filter(l->!l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(output,lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
