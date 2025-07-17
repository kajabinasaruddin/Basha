import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader_Example extends IOException {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\hari.txt");
        FileReader fr=new FileReader(f);
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
