package Input_Output_Streams;
import java.io.*;
public class Buffered_output_Streams_Example {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        String name="alice_bob";
        FileOutputStream fo=new FileOutputStream(f);
        BufferedOutputStream bo=new BufferedOutputStream(fo);
        bo.write(name.getBytes());
        bo.flush();
        System.out.println("Completed");
    }
}
