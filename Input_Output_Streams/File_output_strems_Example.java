package Input_Output_Streams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class File_output_strems_Example {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        String name="alice_bob_charlie\n"+ "asdfg";
        FileOutputStream fo=new FileOutputStream(f);
        fo.write(name.getBytes());
        fo.flush();
        System.out.println("handled");
    }
}
