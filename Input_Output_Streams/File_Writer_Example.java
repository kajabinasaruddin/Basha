package Input_Output_Streams;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class File_Writer_Example {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        String name="Welcome to streamsf \n"+"bob";
        FileWriter fw=new FileWriter(f);
        fw.write(name);
        fw.flush();
        System.out.println("completed");
    }
}
