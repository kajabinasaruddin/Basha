package Input_Output_Streams;

import java.io.*;

public class Buffered_input_stream_Example {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileInputStream fi=new FileInputStream(f);
        BufferedInputStream bi=new BufferedInputStream(fi);
        int ch;
        while((ch=bi.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
