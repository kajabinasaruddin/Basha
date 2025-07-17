package Input_Output_Streams;
import java.io.*;
public class Object_input_streams_Example implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileInputStream fi=new FileInputStream(f);
        ObjectInputStream ob=new ObjectInputStream(fi);
        Object objs=ob.readObject();
        Object_output_Stream_Example obj=(Object_output_Stream_Example) objs;
        System.out.println(obj.getAge()+" "+obj.getName()+" "+obj.getYear());
        System.out.println("completed");
    }
}