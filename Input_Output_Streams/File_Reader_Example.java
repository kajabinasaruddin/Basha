package Input_Output_Streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class File_Reader_Example {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        String name="welcome to bye";
        FileReader fb=new FileReader(f);
        int ch;
        while((ch=fb.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
