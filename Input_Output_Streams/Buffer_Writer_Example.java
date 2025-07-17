package Input_Output_Streams;
import java.io.*;
public class Buffer_Writer_Example {
    public static void main(String[] args)  throws IOException, FileNotFoundException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter b=new BufferedWriter(fw);
        b.write("welcome to fanng");
        b.newLine();
        b.write("hello");
        b.newLine();
        b.write("how sre you");
        b.newLine();
        b.flush();
        System.out.println("data push succesfull!");
    }
}
