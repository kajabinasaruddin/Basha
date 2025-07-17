import java.io.*;

public class File_Writer_Example extends IOException {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\hari.txt");
         String name="alicebob";
        FileOutputStream fw=new FileOutputStream(f);
//        BufferedWriter bf=new BufferedWriter(fw);
//       fw.write(name);
//        fw.flush();
//        System.out.println("completed");
    }
}
