package Input_Output_Streams;
import java.io.*;
public class Serializatin_Example implements Serializable {
    String first_name;
    String last_name;
    int age;

    public Serializatin_Example(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Serializatin_Example obj=new Serializatin_Example("shaik","khajabhi",20);
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileOutputStream fo=new FileOutputStream(f);
        ObjectOutputStream ob=new ObjectOutputStream(fo);
        ob.writeObject(obj);
        System.out.println("completed");
    }
}
