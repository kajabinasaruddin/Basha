package Input_Output_Streams;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_reader_Exception {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        //String name="Welcome";
        BufferedReader br=new BufferedReader(new FileReader(f));
        int ch;
        while((ch=br.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
