package Input_Output_Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class File_input_streams_Example {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File f=new File("C:/Users/SK NAZEER PASHA/Desktop/Alice.txt");
       // String name="khajabi";
        FileInputStream fi=new FileInputStream(f);
        int ch;
        while((ch=fi.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
