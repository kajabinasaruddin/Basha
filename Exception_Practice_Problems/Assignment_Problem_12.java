package Exception_Practice_Problems;
import java.io.File;
import java.io.FileNotFoundException;
public class Assignment_Problem_12 {
    public static void main(String[] args) {
        String path="file.txt";
        File f= new File(path);
        try{
            if (!f.exists()){
                throw new FileNotFoundException("fILE NOT FOUND"+path);
            }
            //System.out.println("");
        }
        catch (Exception e){
            System.out.println("file not found exception");
        }

    }
}
