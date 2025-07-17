import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example11 {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileReader fo=new FileReader(f);
        int ch;
        while((ch=fo.read())!=-1) {
            System.out.print((char)ch);
        }

    }
}
